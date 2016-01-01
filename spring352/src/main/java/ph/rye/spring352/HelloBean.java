package ph.rye.spring352;

import org.springframework.stereotype.Component;

@Component
public class HelloBean implements BeanMarker {

    public String hello() {
        return "Hello";
    }

}
