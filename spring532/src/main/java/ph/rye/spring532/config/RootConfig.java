package ph.rye.spring532.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ph.rye.spring532.service.BeanMarker;

@Configuration
@ComponentScan(basePackageClasses = BeanMarker.class)
@Import(DataConfig.class)
public class RootConfig {}
