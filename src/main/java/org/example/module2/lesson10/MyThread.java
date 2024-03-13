package org.example.module2.lesson10;

class MyThread extends Thread {

    public MyThread() {
        super();
    }

    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}
