package org.example.module2.lesson4;

public class Example2 {
    public static void main(String[] args) {

    }
}

interface IExample2 {
    public abstract void method();
}

abstract class MyClass2 implements IExample2 {


}

abstract class MyClass3 implements IExample2 {
    @Override
    public void method() {

    }
}

class MyClass4 implements IExample2 {

    @Override
    public void method() {
        System.out.println("");
    }
}
