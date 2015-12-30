package ph.rye.spring18.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring18.BeanMarker;
import ph.rye.spring18.MockPrintStream;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
public class Spring18TestConfig {


    @Bean
    public PrintStream stream() {
        return new MockPrintStream();
    }

}
