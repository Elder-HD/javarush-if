package org.example.module2.lesson10;

public class Example4 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
