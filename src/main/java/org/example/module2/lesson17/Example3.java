package org.example.module2.lesson17;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example3 {
    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            IllegalAccessException, NoSuchFieldException {
        Class<C> aClass = C.class;

        Method staticMethod =
                aClass.getDeclaredMethod("staticMethod");

        staticMethod.setAccessible(true);

        staticMethod.invoke(null);
        C c = new C();
        Field field = aClass.getDeclaredField("message");
        field.setAccessible(true);
        field.set(c, "hi");
        System.out.println(c.getMessage());

    }
}

class C {

    private final String message = "hello";

    public String getMessage() {
        return message;
    }

    private static void staticMethod() {
        System.out.println("static method");
    }
}
