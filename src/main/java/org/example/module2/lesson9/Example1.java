package org.example.module2.lesson9;

import java.lang.Object;

public class Example1 extends Object {
    public static void main(String[] args) throws ClassNotFoundException {
        Example1 example1 = new Example1();
        Example1 example2 = new Example1();

        Class<? extends Example1> aClass1 = example1.getClass();
        Class<? extends Example1> aClass2 = example2.getClass();

        System.out.println(aClass1 == aClass2);
        Class<Example1> aClass3 = Example1.class;
        System.out.println(aClass1 == aClass3);

        Class<?> aClass4 = Class.forName("org.example.module2.lesson9.Example1");

        System.out.println(aClass4 == aClass1);

    }
}
