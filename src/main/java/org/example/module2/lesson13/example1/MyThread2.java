package org.example.module2.lesson13.example1;

public class MyThread2 extends Thread {

    private final Recourse recourse;

    public MyThread2(Recourse recourse) {
        this.recourse = recourse;
    }

    @Override
    public void run() {
        recourse.someMethod();
    }
}
