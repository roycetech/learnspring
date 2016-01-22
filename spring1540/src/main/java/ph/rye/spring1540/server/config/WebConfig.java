package ph.rye.spring1540.server.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import ph.rye.spring1540.HelloWorldService;

@Configuration
@ComponentScan(basePackageClasses = {
        HelloWorldService.class })
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public HttpInvokerServiceExporter httpExportedHelloService(final HelloWorldService helloService) {
        final HttpInvokerServiceExporter exporter =
                new HttpInvokerServiceExporter();
        exporter.setService(helloService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }

    @Bean
    public HandlerMapping httpInvokerMapping() {
        final SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
        final Properties mappings = new Properties();
        mappings.setProperty("/hello.service", "httpExportedHelloService");
        mapping.setMappings(mappings);
        return mapping;
    }

}
