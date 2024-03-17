package org.example.module2.lesson12;

public class Example8 {

    public static void main(String[] args) {
        new GameThread().start();
    }
}

class GameThread extends Thread {

    @Override
    public void run() {
        MucisThread mucisThread = new MucisThread();
        mucisThread.setDaemon(true);
        mucisThread.start();

        System.out.println("start game");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 1000000; i++) {
            System.out.println("*");
        }
        System.out.println("end game");

    }
}

class MucisThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("music...");
        }
    }
}
