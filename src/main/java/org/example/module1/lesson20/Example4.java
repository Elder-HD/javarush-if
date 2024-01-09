package org.example.module1.lesson20;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
//        Singleton singleton = new Singleton();  // we cannot create instance using private constructor here


        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
    }
}

// not lazy initialization
class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    //...
}

// lazy initialization
class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }

    //...
}


enum Singleton3 {
    INSTANCE;
}
