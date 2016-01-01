package ph.rye.spring351;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MrBean1 implements BeanMarker {

    @Value("${hello}")
    private String hello;
}
