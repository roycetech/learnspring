package ph.rye.spring20.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring20.BeanMarker;
import ph.rye.spring20.MockPrintStream;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
public class Spring20TestConfig {


    @Bean
    public PrintStream stream() {
        return new MockPrintStream();
    }

}
