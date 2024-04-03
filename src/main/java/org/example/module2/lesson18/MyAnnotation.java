package org.example.module2.lesson18;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
    String value();
    String[] names();

    int c() default 0;
    MyEnum[] myEnum() default {MyEnum.A, MyEnum.B};
}

class C{}

enum MyEnum{
    A,B;
}
