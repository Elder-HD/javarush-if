package org.example.module2.lesson18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Example2 {
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Person {
    String name() default "";

    int live();

    int strength();
}

@Person(name = "ELF", live = 100, strength = 50)
class Elf {
    private static final String NAME = "ELF";
}

class PersonAnnotationProcessor {

    void process(Object item){

    }

}
