package org.example.module2.lesson12.example5;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        Producer producer = new Producer(resource);
        Consumer consumer1 = new Consumer(resource);
        Consumer consumer2 = new Consumer(resource);

        producer.start();
        consumer1.start();
        consumer2.start();

    }
}

class Resource {

    private final Object mutexObject = new Object();
    private int value = 0;

    public void increment() {
        synchronized (mutexObject) {
            while (value == 10) {
                waitFor();
            }
            value++;
            System.out.println("Increment: " + value);

            mutexObject.notifyAll();
        }
    }

    public void decrement() {
        synchronized (mutexObject) {
            while (value == 0){
                waitFor();
            }
            value--;
            Thread.yield();
            System.out.println("Decrement: " + value);
            mutexObject.notifyAll();
        }
    }

    private void waitFor() {
        try {
            mutexObject.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Producer extends Thread {

    private final Resource resource;

    Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.increment();
        }
    }
}

class Consumer extends Thread {

    private final Resource resource;

    Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.decrement();
        }
    }
}