package ph.rye.spring22;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MockPrintStream extends PrintStream {


    private static StringBuffer printBuffer = new StringBuffer();


    public MockPrintStream() {
        super(new ByteArrayOutputStream());
    }


    @Override
    public void println(final String string) {
        printBuffer.append(string).append("\n");
    }

    public String getPrintedString() {
        return printBuffer.toString();
    }

    public void clear() {
        printBuffer = new StringBuffer();
    }
}
