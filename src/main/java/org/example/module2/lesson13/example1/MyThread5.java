package org.example.module2.lesson13.example1;

public class MyThread5 extends Thread{
    private final ResourceB resourceB;

    public MyThread5(ResourceB resourceB) {
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        resourceB.method();
    }
}
