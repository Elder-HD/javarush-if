package org.example.module2.lesson13.example1;

public class MyThread4 extends Thread{

    private final ResourceB resourceB;

    public MyThread4(ResourceB resourceB) {
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        resourceB.method();
    }
}
