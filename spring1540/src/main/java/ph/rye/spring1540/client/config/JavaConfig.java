package ph.rye.spring1540.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import ph.rye.spring1540.HelloWorldService;


@Configuration
public class JavaConfig {

    @Bean
    public HttpInvokerProxyFactoryBean helloWorldService() {
        final HttpInvokerProxyFactoryBean proxy =
                new HttpInvokerProxyFactoryBean();
        proxy.setServiceUrl("http://localhost:8080/Hello/hello.service");
        proxy.setServiceInterface(HelloWorldService.class);
        return proxy;
    }

}
