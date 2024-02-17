package org.example.module2.lesson2;

public class Example4 {
    public static void main(String[] args) {
        AB ab1 = new AB();
        AB ab2 = new AB();

        ab1.value=1;
        ab2.value=2;

        System.out.println(ab1.value);
        System.out.println(ab2.value);
    }
}

abstract class MyAbstractClass {

    public int value;

    public abstract void abstractMethod();
}

class AB extends  MyAbstractClass{

    @Override
    public void abstractMethod() {

    }
}

