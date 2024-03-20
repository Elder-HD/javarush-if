package org.example.module2.lesson13.example1;

public class Recourse {

    private final Object monitor = new Object();
    public void someMethod() {
       synchronized (monitor){
           while (true){
               waitFor(0);
           }
       }
    }

    private void waitFor(int time) {
        try {
            monitor.wait(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
