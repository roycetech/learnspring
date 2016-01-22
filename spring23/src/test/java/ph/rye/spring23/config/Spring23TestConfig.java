package ph.rye.spring23.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import ph.rye.spring23.BeanMarker;
import ph.rye.spring23other.Spring23OtherTestConfig;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
@Import(Spring23OtherTestConfig.class)
@ImportResource("classpath:spring.xml")
public class Spring23TestConfig {


}
