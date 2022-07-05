package never.doTest.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;


@Target({TYPE,CONSTRUCTOR})
//元注解 RetentionPolicy.RUNTIME才能反编译   默认为RetentionPolicy.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String[] value();
}
