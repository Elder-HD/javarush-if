package org.example.module3.lesson18;

public class Example2 {
    public static void main(String[] args) {
        Container container = new Container();
        MyThread myThread1 = new MyThread(container);
        MyThread myThread2 = new MyThread(container);

        myThread1.start();
        myThread2.start();
    }
}

class Container {
    A a = new A(new Object(), new Object());
    public void methodOne() {
        int variable1 = 1;
        A variable2 = a;
    }
    public void methodTwo() {
        Object variable1 = new Object();
    }
}

class A {
    private final Object value1;
    private final Object value2;

    A(Object value1, Object value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}

class MyThread extends Thread{

    private final Container container;

    MyThread(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        container.methodOne();
        container.methodTwo();
    }
}
