package org.example.module2.lesson12.example1;

public class Example1 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

class Resource {
    private int value = 0;

    // non static method this mutex
    public synchronized void increment() {
        value++;
        System.out.println("Increment: " + value);
    }

    public synchronized void decrement() {
        value--;
        System.out.println("Decrement: " + value);
    }

    //Resource.class --> Class<Resource>
    public static synchronized void method(){

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