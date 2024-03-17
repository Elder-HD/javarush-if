package org.example.module2.lesson12;

public class Example7 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(9);
        myThread.start();
        myThread.setPriority(3);

        Thread thread = Thread.currentThread();
        thread.setPriority(9);
        int priority = thread.getPriority();
        System.out.println("main thread priority " + priority);

    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("my thread priority" + getPriority());
    }
}
