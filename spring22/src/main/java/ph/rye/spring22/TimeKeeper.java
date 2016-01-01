package ph.rye.spring22;

import java.io.PrintStream;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeKeeper {


    PrintStream stream;


    @Autowired
    TimeKeeper(final PrintStream stream) {
        this.stream = stream;
    }

    @Pointcut("execution(** ph.rye.spring22.Developer.focusPriority(int)) && args(priority)")
    public void checkTime(final int priority) {}


    @Before("checkTime(priority)")
    public void logTime(final int priority) {
        stream.println("Taking note of priority: " + priority);
    }

}

