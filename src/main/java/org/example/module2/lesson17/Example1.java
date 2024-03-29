package org.example.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example1 {

    private static final String LINE = "=".repeat(100);

    public static void main(String[] args)
            throws InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {
        A a = new A();
        a.print();

        System.out.println(LINE);

        Class<A> aClass = A.class;
//        A instanceA = aClass.newInstance(); // this approach is deprecated

        Constructor<A> constructor = aClass.getConstructor();
        A instanceA = constructor.newInstance();

        Method methodPrint = aClass.getMethod("print");
        methodPrint.invoke(instanceA);
    }

}

class A {

    public A(){
        System.out.println("A constructor");
    }

    public void print() {
        System.out.println("hello");
    }
}
