package org.example.module2.lesson12.example4;

public class Example4 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

class Resource {
    private volatile int value = 0;

    public void m(){
        value=2;
    }

    public void increment() {
        value++; // value =value +1;
        System.out.println("Increment: " + value);
    }

    public void decrement() {
        value--;
        System.out.println("Decrement: " + value);
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