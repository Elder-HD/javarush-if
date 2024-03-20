package org.example.module2.lesson13.example1;

public class MyThread extends Thread {
private final Recourse recourse;

    public MyThread(Recourse recourse) {
        this.recourse = recourse;
    }

    @Override
    public void run() {
        while (true) {
//            System.out.println("run");
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
