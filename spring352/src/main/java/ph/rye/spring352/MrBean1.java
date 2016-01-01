package ph.rye.spring352;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MrBean1 implements BeanMarker {

    @Value("#{1}")
    private int field1;
}
