package ph.rye.spring16;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DrySkill implements Skill {


    private final PrintStream stream;

    @Autowired
    public DrySkill(final PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void apply() {
        stream.println("Applying dry skill...");
    }

}
