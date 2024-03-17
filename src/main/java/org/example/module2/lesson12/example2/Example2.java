package org.example.module2.lesson12.example2;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();

        Thread.sleep(1000);
        synchronized (resource){
            while (true){
                System.out.println("...");
            }
        }
    }
}

class Resource {
    private int value = 0;

    // non static method this mutex
    public void increment() {
        synchronized(this){
            value++;
            System.out.println("Increment: " + value);
        }
    }

    public void decrement() {
        synchronized (this) {
            value--;
            System.out.println("Decrement: " + value);
        }
    }

    //Resource.class --> Class<Resource>
    public static  void method(){
      synchronized (Resource.class){

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