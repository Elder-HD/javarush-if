package org.example.module2.lesson8;

public class Example1 {
    public static void main(String[] args) {
        new MyClass1(1);
        System.out.println("========================");
        new MyClass1(2);
    }
}

class MyClass1 {
    private static int counter = 0;

    {
        System.out.println("non static initialization block -1");
        counter++;
        intValue = 0;
    }

    private int intValue;

    public MyClass1(int intValue) {
        this();
        System.out.println("constructor with parameter");
    }

    {
        System.out.println("non static initialization block -2");
    }

    public MyClass1() {
        super(); // invoke constructor from class object
        System.out.println("constructor without parameters");
    }
}
