package org.example.module1.lesson22;

public class Example3 {
}

class A {
    public static void main(String[] args) {

        System.out.println("-----------");
        int a = 0;
        m1();
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement);
        }
    }
}
