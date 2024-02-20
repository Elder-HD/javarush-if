package org.example.module2.lesson4;

public class Example1 {
    public static void main(String[] args) {
        MyExampleClass1 myExampleClass1 = new MyExampleClass1();
        MyExampleClass2 myExampleClass2 = new MyExampleClass2();

        IExample1[] items = {myExampleClass1, myExampleClass2};

        for (IExample1 item : items) {
            item.method1();
        }
    }
}

abstract interface IExample1 {
    void method1();

    String method2(String message);
}

class MyExampleClass1 implements IExample1 {

    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public String method2(String message) {
        System.out.println("method2 with parameter: " + message);
        return null;
    }
}

class MyExampleClass2 implements IExample1 {

    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public String method2(String message) {
        System.out.println("method2 with parameter: " + message);
        return null;
    }
}

