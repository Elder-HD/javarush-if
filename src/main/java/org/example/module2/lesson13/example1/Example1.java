package org.example.module2.lesson13.example1;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        String name = Thread.currentThread().getName();
        System.out.println("main thread name: " + name);

        Recourse recourse = new Recourse();
        Thread thread = new Thread(() -> {
        });
        MyThread myThread = new MyThread(recourse);
        MyThread2 myThread2 = new MyThread2(recourse);
        MyThread3 myThread3 = new MyThread3();
        ResourceB resourceB = new ResourceB();
        MyThread4 myThread4 = new MyThread4(resourceB);
        MyThread5 myThread5 = new MyThread5(resourceB);

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        Thread.sleep(100);
        Thread.State state = myThread.getState();
        Thread.State state2 = myThread2.getState();
        System.out.println("thread state: " + thread.getState());
        System.out.println("thread1 state: " + state);
        System.out.println("thread2 state: " + state2);
        System.out.println("thread3 state: " + myThread3.getState());
        System.out.println("thread4 state: " + myThread4.getState());
        System.out.println("thread5 state: " + myThread5.getState());
    }
}
