package ph.rye.spring352;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MrBean2 implements BeanMarker {

    @Value("#{T(Math).PI}")
    private float field1;

}
