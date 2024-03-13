package org.example.module2.lesson10;

public class Example8 {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        aThread.start();
        ThreadUtility.sleepForSeconds(5);
        System.out.println("wakeup");
        aThread.signalToStop();

    }
}

class AThread extends Thread {

    private boolean isWorking = true;

    public void signalToStop() {
        isWorking = false;
    }

    @Override
    public void run() {
        System.out.println("start");
        while (isWorking) {
            ThreadUtility.sleepForSeconds(1);
            System.out.println("....");
        }
        System.out.println("end");
    }
}
