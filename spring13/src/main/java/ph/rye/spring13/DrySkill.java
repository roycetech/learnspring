package ph.rye.spring13;

import java.io.PrintStream;

public class DrySkill implements Skill {


    private final PrintStream stream;


    public DrySkill(final PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void apply() {
        stream.println("Applying dry skill...");
    }

}
