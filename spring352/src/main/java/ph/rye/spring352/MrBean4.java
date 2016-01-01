package ph.rye.spring352;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MrBean4 implements BeanMarker {

    @Value("#{helloBean.hello().toUpperCase()}")
    private String greeting;

}
