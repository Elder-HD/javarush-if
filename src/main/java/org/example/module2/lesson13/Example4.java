package org.example.module2.lesson13;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i =0; i<10; i++) {
            executorService.submit(()-> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int sum =0;
                for (int j = 0; j < 1_000_000; j++) {
                    sum+=j;
                }
                System.out.println("sum: "+sum);
            });
        }

        Thread.sleep(2000);
        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println(runnables.size());

//        executorService.submit(()->{});
    }
}
