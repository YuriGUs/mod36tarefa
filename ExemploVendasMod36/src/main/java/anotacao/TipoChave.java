package anotacao;

import java.lang.annotation.*;

/**
 * @author yuri
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
