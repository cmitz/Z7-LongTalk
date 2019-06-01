package nl.caspersmits.cos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CompilerTest {

    private Compiler compiler;

    @BeforeEach
    void setupCompiler() {
        compiler = new Compiler();
    }

    @Test
    public void testHelloWorld() {
        try {
            compiler.compileString("program do print \"Hello World!\" stop");

            String output = Compiler.runClassFile();
            assertEquals( "Hello World!\n", output );
        } catch (Throwable e) {
            fail(e.toString());
        }

    }
}
