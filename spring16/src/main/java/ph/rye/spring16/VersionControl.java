package ph.rye.spring16;

import java.io.PrintStream;

public class VersionControl implements Tool {


    private final PrintStream stream;


    public VersionControl(final PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void use() {
        stream.println("Tracking version is great!");
    }

}
