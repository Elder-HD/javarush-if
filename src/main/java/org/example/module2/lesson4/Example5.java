package org.example.module2.lesson4;

public class Example5 {
    public static void main(String[] args) {

    }
}

class MyExample5Class implements ITotal {

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodC() {

    }

    @Override
    public String getTotalMessage() {
        return null;
    }
}

interface ITotal extends IA5, IB5, IC5 {
    String getTotalMessage();
}

interface IA5 {
    void methodA();
}

interface IB5 {
    void methodB();
}

interface IC5 {
    void methodC();
}