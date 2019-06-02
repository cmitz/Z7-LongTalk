package nl.caspersmits.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CompilerTest {

    private Compiler compiler;

    @BeforeEach
    void setupCompiler() {
        compiler = new Compiler();
    }

    @Test
    void testHelloWorld() {
        try {
            compiler.compileString("program do print \"Hello World!\" stop");

            String output = Compiler.runClassFile();
            assertEquals( "Hello World!\n", output );
        } catch (Throwable e) {
            fail(e.toString());
        }
    }

    @Test
    void testExampleOne() {
        String expectedOutput = "Hello world!\n";
        assertEqualsOutputFile("examples/01-print.lt", expectedOutput);
    }


    @Test
    void testExampleTwo() {
        String expectedOutput = "15\n" +
                "Hello World\n" +
                "true\n";

        assertEqualsOutputFile("examples/02-variables.lt", expectedOutput);
    }

    @Test
    void testExampleThree() {
        String expectedOutput = "Program Variable\n" +
                "Smaller Scope Variable\n" +
                "Program Variable\n";

        assertEqualsOutputFile("examples/03-scoping.lt", expectedOutput);
    }

    @Test
    void testExampleFour() {
        String expectedOutput = "42 is truly the answer\n";
        assertEqualsOutputFile("examples/04-branching.lt", expectedOutput);
    }

    @Test
    void testExampleFive() {
        String expectedOutput = "Indexed loop:\n" +
                "1\n" +
                "Indexed loop:\n" +
                "2\n" +
                "Indexed loop:\n" +
                "3\n" +
                "Indexed loop:\n" +
                "4\n" +
                "Indexed loop:\n" +
                "5\n" +
                "Loop while:\n" +
                "0\n" +
                "Loop while:\n" +
                "1\n";
        assertEqualsOutputFile("examples/05-loops.lt", expectedOutput);
    }

    @Test
    void testBadExampleOne() {
        String expectedOutput = "line 3:0 mismatched input 'stop' expecting {'(', BOOLEAN, INT, STRING, IDENTIFIER}\n";

        assertEqualsCompileErrors(
                "examples/91-SyntaxError-print.lt",
                LongTalkSyntaxException.class,
                expectedOutput);
    }

    @Test
    void testBadExampleTwo() {
        String expectedOutput = "Error on line 2: Variable myVariable must be declared before assignment\n" +
                "Error on line 4: Variable myVariable not declared.\n";

        assertEqualsCompileErrors(
                "examples/92-DeclarationError-variables.lt",
                LongTalkTypeException.class,
                expectedOutput);
    }

    /**
     * Asserts that the output of a source file is the same as expected
     * @param fileName          Source file to compile and run
     * @param expectedOutput    Output that is expected
     */
    void assertEqualsOutputFile(String fileName, String expectedOutput) {
        try {
            compiler.compileFile(fileName);

            String actualOutput = Compiler.runClassFile();
            assertEquals( expectedOutput, actualOutput);
        } catch (Throwable e) {
            fail(e.toString());
        }
    }

    /**
     * Asserts that the compiling of a bad file throws errors and prints those
     * @param fileName              Source file to compile and run
     * @param expectedException     LongTypeException class to assert
     * @param expectedOutput        Output that is expected
     */
    <T extends LongTalkException> void assertEqualsCompileErrors(String fileName, Class<T> expectedException, String expectedOutput) {
        // Capture stdErr
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        PrintStream stdErr = System.err;
        System.setErr(new PrintStream(errContent));

        assertThrows(expectedException, () -> {
            compiler.compileFile(fileName);
        });

        assertEquals(expectedOutput, errContent.toString());

        // Reset stdErr
        System.setErr(stdErr);
    }
}
