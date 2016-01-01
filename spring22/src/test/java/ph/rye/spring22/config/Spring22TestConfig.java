package ph.rye.spring22.config;

import java.io.PrintStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring22.BeanMarker;
import ph.rye.spring22.MockPrintStream;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
public class Spring22TestConfig {


    @Bean
    public PrintStream stream() {
        return new MockPrintStream();
    }

}
