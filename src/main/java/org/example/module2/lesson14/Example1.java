package org.example.module2.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(2);

        List<Callable<Void>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(new Task());
        }

        List<Future<Void>> futures = executorService.invokeAll(tasks);

    }
}

class Task implements Runnable,Callable<Void> {
    private static volatile int counter = 0;

    private int currentNumber = counter;

    public Task() {
        counter++;
    }

    @Override
    public void run() {
        System.out.println("thread number: " + currentNumber);
    }


    @Override
    public Void call() throws Exception {
        System.out.println("thread number: " + currentNumber);
        return null;
    }
}
