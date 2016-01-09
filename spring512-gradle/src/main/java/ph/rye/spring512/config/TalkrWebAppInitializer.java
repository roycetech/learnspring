package ph.rye.spring512.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ph.rye.spring512.web.WebConfig;

public class TalkrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings() {
        System.out.println("*****************************getServletMappings");
        return new String[] {
                "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("*****************************getRootConfigClasses");
        return new Class<?>[] {
                RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out
            .println("*****************************getServletConfigClasses");
        return new Class<?>[] {
                WebConfig.class };
    }

}
