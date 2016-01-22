package ph.rye.spring1521.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import ph.rye.spring1521.HelloWorldService;

@Configuration
public class JavaConfig {

    @Bean
    public RmiProxyFactoryBean helloWorldService() {
        final RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
        rmiProxy.setServiceUrl("rmi://localhost:2020/HelloWorldService");
        rmiProxy.setServiceInterface(HelloWorldService.class);
        return rmiProxy;
    }

}
