package Annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited

public @interface AnnotationExam {
    String param();
    int param1() default 20;
}
