package ph.rye.spring21;

import java.io.PrintStream;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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


    @Pointcut("execution(** ph.rye.spring21.Developer.performDuty(..))")
    public void checkWorker() {}


    @Around("checkWorker()")
    public void watchPerformance(final ProceedingJoinPoint jp) {
        try {
            stream.println("Log time in.");
            jp.proceed();
            stream.println("Log time out.");
        } catch (final Throwable e) {
            stream.println("Call to manager's office");
        }
    }

}

