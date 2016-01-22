package ph.rye.spring1550.server.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import ph.rye.spring1550.HelloWorldService;


@Configuration
@ComponentScan(basePackageClasses = {
        HelloWorldService.class })
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public SimpleJaxWsServiceExporter jaxWsExporter() {

        final SimpleJaxWsServiceExporter exporter =
                new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8080/Hello/services/");

        return exporter;


    }


}
