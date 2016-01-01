package ph.rye.spring21.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring21.BeanMarker;
import ph.rye.spring21.MockPrintStream;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
public class Spring21TestConfig {


    @Bean
    public PrintStream stream() {
        return new MockPrintStream();
    }

}
