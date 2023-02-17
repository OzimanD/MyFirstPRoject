package PRO.l6.ex_001_Annotations.methods;

import java.lang.annotation.*;

/*
    @Target(ElementType.TYPE) - анотація може використовуватися тілько з класом, інтерфейсом, перерахуванням enum або з іншою анотацією.

    @Documented - вказуємо, що дана анотація буде вказана в згенерованій документації JavaDoc.

    @Retention(RetentionPolicy.RUNTIME) - анотація зберігається у .class файлі та доступна під час виконання програми.

    @Inherited - анотація автоматично успадковується у дочірніх класах описаного інструкцією класу.
 */

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
/**
 * Created by Yevhenii Tykhonov
 * @param creating annotation Mammal with annotation Documented
 */
public @interface Mammal {
    /**
     * @return sound of mammal
     */
    String sound();

    /**
     * @return color of mammal
     */
    int color() default 0xffffff;
}