package nl.caspersmits.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

        try {
            compiler.compileFile("examples/01-print.lt");

            String actualOutput = Compiler.runClassFile();
            assertEquals( expectedOutput, actualOutput);
        } catch (Throwable e) {
            fail(e.toString());
        }
    }


    @Test
    void testExampleTwo() {
        String expectedOutput = "15\n" +
                "Hello World\n" +
                "true\n";

        try {
            compiler.compileFile("examples/02-variables.lt");

            String actualOutput = Compiler.runClassFile();
            assertEquals( expectedOutput, actualOutput);
        } catch (Throwable e) {
            fail(e.toString());
        }
    }


    @Test
    void testExampleThree() {
        String expectedOutput = "Program Variable\n" +
                "Smaller Scope Variable\n" +
                "Program Variable\n";

        try {
            compiler.compileFile("examples/03-scoping.lt");

            String actualOutput = Compiler.runClassFile();
            assertEquals( expectedOutput, actualOutput);
        } catch (Throwable e) {
            fail(e.toString());
        }
    }
}
