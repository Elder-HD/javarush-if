package org.example.module2.lesson12;

public class Example6 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                sleepSomeSeconds(2);
                for (int i=0; i<10000; i++) {
                    System.out.println("*");
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                sleepSomeSeconds(2);
                for (int i=0; i<10000; i++) {
                    System.out.println("+");
                }
            }
        };
        thread1.start();
        thread2.start();

        System.out.println("join thread 1");
        thread1.join();

        System.out.println("join thread 2");
        thread2.join();

        System.out.println("end main thread");
    }


    private static void sleepSomeSeconds(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


