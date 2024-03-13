package org.example.module2.lesson10;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        int millis = 10_000;
        System.out.println("Start");
        new MyThread().start();
        Thread.sleep(millis);
        new MyThread().start();
        System.out.println("end");
    }
}
