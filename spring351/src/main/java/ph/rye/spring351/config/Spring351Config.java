package ph.rye.spring351.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import ph.rye.spring351.BeanMarker;


@Configuration
@ComponentScan(basePackageClasses = {
        BeanMarker.class })
@PropertySource("classpath:/ph/rye/spring351/Spring351.properties")
public final class Spring351Config {


    private Spring351Config() {}


    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
