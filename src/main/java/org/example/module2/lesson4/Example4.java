package org.example.module2.lesson4;

public class Example4 {
    public static void main(String[] args) {
        MyExample4Class item = new MyExample4Class();
        IA4 ia4 = item;
        IB4 ib4 = item;

        item.method();
        ia4.method();
        ib4.method();

    }
}

class MyExample4Class implements IA4, IB4 {

    @Override
    public void method() {

    }

    @Override
    public void method2() {

    }
//
//    public String method(){
//        return null;
//    }
}

interface IA4 {
    void method();

    void method2();
}

interface IB4 {
    void method();
}

interface IC4 {
    String method();
}
