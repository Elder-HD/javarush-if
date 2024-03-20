package org.example.module2.lesson13.example2;

public class MyThread extends Thread{

    public long count=0;

    public MyThread(String name) {
        super(name);

    }
    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}

class MyRunnable implements Runnable{
    public long count=0;

    public MyRunnable() {
    }
    @Override
    public void run() {
        while (true){
            count++;
        }
    }
}
