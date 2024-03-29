package org.example.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Example2 {
    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchFieldException {
        Class<B> aClass = B.class;

        Constructor<B> constructor = aClass.getDeclaredConstructor(String.class);
        Method method = aClass.getDeclaredMethod("print", int.class);

        constructor.setAccessible(true);
        B b = constructor.newInstance("Hello");

        method.setAccessible(true);
        method.invoke(b, 2);
        System.out.println("=============================");

        Parameter[] parameters = constructor.getParameters();

        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        Field field = aClass.getDeclaredField("message");
        field.setAccessible(true);
        field.set(b, "hi");

        method.invoke(b, 3);



    }
}

class B {
    private String message; // 0000  (private, private-package, protected, public)/static/final/
  // 0000000000
    // 00 -
    //_**
    private B( final String message) {
        this.message = message;
    }

    //    00000
    private void print(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}
