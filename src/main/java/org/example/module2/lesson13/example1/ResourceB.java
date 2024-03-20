package org.example.module2.lesson13.example1;

public class ResourceB {
    private final Object monitor = new Object();

    public void method(){
        synchronized (monitor){
            while (true){}
        }
    }
}
