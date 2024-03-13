package org.example.module2.lesson10;

import static org.example.module2.lesson10.ThreadUtility.sleepForSeconds;

public class Example7 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("start");
            sleepForSeconds(5);
            System.out.println("end");
        });
        thread.start();

        sleepForSeconds(1);

        //https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html
        thread.stop();
    }

}
