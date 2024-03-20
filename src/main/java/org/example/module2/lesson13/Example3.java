package org.example.module2.lesson13;

public class Example3 {
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler eh = (thread,throwable)->{
            System.out.println("*".repeat(100));
            System.out.println(throwable);
            System.out.println("*".repeat(100));
        };
        Thread.setDefaultUncaughtExceptionHandler(eh);
        boolean isWorking =true;
        if(isWorking) {
            throw new RuntimeException("exception message");
        }
        Thread.currentThread().setUncaughtExceptionHandler((thread, throwable)->{});

    }
    //default:
    //Exception in thread "main" java.lang.RuntimeException: exception message
    //	at org.example.module2.lesson13.Example3.main(Example3.java:8)
}
