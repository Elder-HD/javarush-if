package org.example.module3.lesson18;

public class Example3 {
    public static void main(String[] args) {
        ContainerA container = new ContainerA();
        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);
        producer.start();
        consumer.start();

    }
}
class ContainerA{
    private volatile long value;

    public synchronized void increment(){
        value= value+1; // 7+1
        System.out.println(value);
        int a = 1-1;
        int b = 2+3;
        int c = a+b;
    }

    public synchronized void decrement(){
        value--;
        System.out.println(value);
    }
}

class Producer extends Thread{
    private  final  ContainerA container;

    Producer(ContainerA container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            container.increment();
        }
    }
}

class Consumer extends Thread{
    private  final  ContainerA container;

    Consumer(ContainerA container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            container.decrement();
        }
    }
}
