package ph.rye.spring521.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ph.rye.spring521.web.WebConfig;

public class TalkrWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/" };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
                WebConfig.class };
    }

}
