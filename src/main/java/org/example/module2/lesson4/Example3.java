package org.example.module2.lesson4;

public class Example3 {
    public static void main(String[] args) {
        Example3Class example3Class = new Example3Class();
        example3Class.methodA();
        example3Class.methodB();
        example3Class.ownMethod();

        ///

        IA ia = example3Class;
        ia.methodA();
//        ia.methodB();
//        ia.ownMethod();
        ((Example3Class)ia).methodB();
        ((IB)ia).methodB();


        IB ib = example3Class;
//        ib.methodA();
        ib.methodB();
//        ib.ownMethod();
    }
}

interface IA {
    void methodA();
}

interface IB {
    void methodB();
}

class Example3Class implements IA, IB {

    @Override
    public void methodA() {
        System.out.println("method A");
    }

    @Override
    public void methodB() {
        System.out.println("method B");
    }

    public void ownMethod(){
        System.out.println("own method");
    }
}
