package PRO.l6.ex_001_Annotations.methods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target(ElementType.METHOD) - анотація може використовуватися лише з методом класу.

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface HasHair {
    int length() default 10;
}
