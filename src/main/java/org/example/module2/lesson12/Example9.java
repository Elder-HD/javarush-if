package org.example.module2.lesson12;

//Deadlock
public class Example9 {
    public static void main(String[] args) {
        Resource a = new Resource("A");
        Resource b = new Resource("B");

        Thread1 thread1 = new Thread1(a, b);
        Thread1 thread2 = new Thread1(b,a);
        thread1.start();
        thread2.start();
    }
}

class Resource {
    private final String name;

    Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Thread1 extends Thread {
    private final Resource resource1;
    private final Resource resource2;

    Thread1(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println("thread: " + getName() + " get resource " + resource1.getName());

            synchronized (resource2) {
                System.out.println("thread: " + getName() + " get resource " + resource2.getName());

            }
        }
    }
}

