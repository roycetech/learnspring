package ph.rye.spring1521.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import ph.rye.spring1521.HelloWorldService;

@Configuration
@ComponentScan(basePackageClasses = {
        HelloWorldService.class })
public class JavaConfig {

    @Bean
    public RmiServiceExporter rmiExporter(final HelloWorldService helloService) {
        final RmiServiceExporter rmiExporter = new RmiServiceExporter();
        rmiExporter.setService(helloService);
        rmiExporter.setServiceName("HelloWorldService");
        rmiExporter.setServiceInterface(HelloWorldService.class);
        rmiExporter.setRegistryHost("localhost");
        rmiExporter.setRegistryPort(2020);
        return rmiExporter;
    }


}
