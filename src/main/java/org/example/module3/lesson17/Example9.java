package org.example.module3.lesson17;

public class Example9 {
}

class ContainerA {

    private int value = 0;

    public synchronized int getIncrementedValue() {
        value++;
        return value;
    }

    public synchronized int getDecrementValue() {
        value--;
        return value;
    }


}
