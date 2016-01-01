package ph.rye.spring20;

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

    @Pointcut("execution(** ph.rye.spring20.Developer.performDuty(..))")
    public void checkTime() {}


    @Before("checkTime()")
    public void logTime() {
        stream.println("Time in.");
    }

}

