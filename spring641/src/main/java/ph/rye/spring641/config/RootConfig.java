package ph.rye.spring641.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ph.rye.spring641.service.BeanMarker;

@Configuration
@ComponentScan(basePackageClasses = BeanMarker.class)
@Import(DataConfig.class)
public class RootConfig {}
