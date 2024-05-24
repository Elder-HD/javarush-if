package org.example.module3.lesson16;

public class Example4 {
    public static void main(String[] args) {

    }
}

class ASingleton {
    private static final ASingleton INSTANCE = new ASingleton();

    private ASingleton() {

    }

    public static ASingleton getInstance() {
        return INSTANCE;
    }

    public void method() {

    }
}

class BSingleton {
    private static BSingleton instance;

    private BSingleton() {

    }

    //lazy initialization
    public static BSingleton getInstance() {
        if (instance == null) {
            instance = new BSingleton();
        }
        return instance;
    }

    public void method() {

    }
}

class CSingleton {
    private static CSingleton instance;

    private CSingleton() {

    }

    //lazy initialization + thread-safe
    public static synchronized CSingleton getInstance() {
        if (instance == null) {
            instance = new CSingleton();
        }
        return instance;
    }

    public void method() {

    }
}

class DSingleton {
    private static final Object LOCK = new Object();

    private static DSingleton instance;

    private DSingleton() {

    }

    //lazy initialization + thread-safe + double-check
    public static DSingleton getInstance() {
        if (instance == null) {

            synchronized (LOCK) {
                if (instance == null) {
                    instance = new DSingleton();
                }
            }
        }
        return instance;
    }

    public void method() {

    }
}

enum ESingleton {
    ONE;

    public void method() {

    }
}

// singleton on inner static class



