package org.example.module2.lesson13.example2;

import java.util.concurrent.TimeUnit;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread("1");
        MyThread myThread2 = new MyThread("2");
        myThread1.setPriority(1);
        myThread2.setPriority(10);

        myThread1.start();
        myThread2.start();

        TimeUnit.SECONDS.sleep(10);

        long count2 = myThread2.count;
        long count1 = myThread1.count;
        System.out.println("myThread2: "+ count2);
        System.out.println("myThread1: "+ count1);

        System.out.println((count2-count1)*100.0/count1);
    }
}
