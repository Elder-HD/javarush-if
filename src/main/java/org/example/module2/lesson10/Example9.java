package org.example.module2.lesson10;

public class Example9 {
    public static void main(String[] args) {
        BThread thread = new BThread();
        thread.start();
        ThreadUtility.sleepForSeconds(5);
        System.out.println("wakeup");
//        thread.signalToStop();

        thread.interrupt();

        ThreadUtility.sleepForSeconds(1);
        System.out.println("end main thread");
    }
}

class BThread extends Thread {

//    private boolean isWorking = true;

//    public void signalToStop() {
//        isWorking = false;
//    }

    @Override
    public void run() {
        System.out.println("start");

        try {
            while (!isInterrupted()) {
                ThreadUtility.sleepForSeconds(1);
                System.out.println("....");
            }
        } catch (RuntimeException r){
            handleException(r);
        }

        System.out.println("end");
    }

    private void handleException(RuntimeException r) {
        Throwable cause = r.getCause();
        if(cause instanceof InterruptedException){
            System.out.println("log:...");
            interrupt();
        } else {
            throw r;
        }
    }
}

