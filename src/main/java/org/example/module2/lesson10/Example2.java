package org.example.module2.lesson10;

public class Example2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread1.run(); // new thread is not created

        myThread.start();
        myThread.start();
    }
}

