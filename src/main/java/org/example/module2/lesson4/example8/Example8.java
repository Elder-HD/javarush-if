package org.example.module2.lesson4.example8;

abstract public class Example8 {
     abstract void method();
}

abstract interface A {
    public static final int MY_CONSTANT = 10;

    public abstract void abstractMethod();

    // from java 8

    public default void methodWithDefaultImplementation(){
        System.out.println("default implementation");

        privateMethod();
    }

    public static void staticMethod(){
        System.out.println("static method");
    }

    // from java 9

    private void privateMethod(){
        System.out.println("private method");
    }

    private static void privateStaticMethod(){
        System.out.println("private static method");
    }
}
