package org.example.module2.lesson9;

public class Example2 {
    public static void main(String[] args) {
        Class<A> aClass = A.class;
    }
}

class A {
    static {
        System.out.println("static block A");
    }
}
