package org.example.module2.lesson9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example5 {
    public static void main(String[] args) {
        Class<B1> b1Class = B1.class;
        Class<? super B1> superclass = b1Class.getSuperclass();
        System.out.println(superclass.getName());

        System.out.println("methods");
        Method[] methods = b1Class.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("=".repeat(100));
        System.out.println("Fields");
        Field[] fields = b1Class.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}

class A1 {
    public int value;

    public void aMethod() {

    }
}

class B1 extends A1 {
    public String line;
}
