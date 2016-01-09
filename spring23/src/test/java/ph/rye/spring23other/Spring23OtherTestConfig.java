package ph.rye.spring23other;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring23.MockPrintStream;


@Configuration
public class Spring23OtherTestConfig {


    @Bean
    public PrintStream stream() {
        return new MockPrintStream();
    }

}
