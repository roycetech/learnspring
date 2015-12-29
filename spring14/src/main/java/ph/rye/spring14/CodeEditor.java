package ph.rye.spring14;

import java.io.PrintStream;

public class CodeEditor implements Tool {

    private final PrintStream stream;

    public CodeEditor(final PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void use() {
        stream.println("I can help you write code more efficiently!");
    }

}
