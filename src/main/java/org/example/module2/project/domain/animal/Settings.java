package org.example.module2.project.domain.animal;

public @interface Settings {
    String filename();

    boolean isHunter() default false;

    String filenameMenu() default "";

}
