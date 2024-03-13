package org.example.module2.lesson10;

public class Example5 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("my_thread"); //Thread-... ==> rename to custome name

        myThread.start();
    }
}
