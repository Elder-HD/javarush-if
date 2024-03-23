package org.example.module2.lesson14;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }
}

final class InformationHolder {


    private static final ThreadLocal<Integer> STORAGE = new ThreadLocal<>();

    public static void holdValue(Integer value) {
        InformationHolder.STORAGE.set(value);
        System.out.println("Thread: " + Thread.currentThread().getName() + "put value: " + value + "get value: " + getValue());
    }

    public static Integer getValue() {
        return STORAGE.get();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        while (true) {
//            try {
////                Thread.sleep(1_000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }



            InformationHolder.holdValue(new Random().nextInt());
        }
    }
}
