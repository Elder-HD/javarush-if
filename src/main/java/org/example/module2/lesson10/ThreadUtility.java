package org.example.module2.lesson10;

public final class ThreadUtility {

    private ThreadUtility(){

    }

    public static void sleepForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
