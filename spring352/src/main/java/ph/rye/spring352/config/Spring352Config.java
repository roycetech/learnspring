package ph.rye.spring352.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ph.rye.spring352.BeanMarker;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
public class Spring352Config {


}
