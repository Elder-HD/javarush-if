package org.example.module2.lesson4.example6;

public class Example6 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod();
        myClass.methodWithDefaultImpl();
        IA.staticMethod();
        System.out.println(IA.VALUE);
//        myClass.staticMethod();
    }
}


interface IA {
    public static final int VALUE = 1;

    void abstractMethod();

    default void methodWithDefaultImpl() {
        System.out.println("method with default implementation");
    }

    default void method() {
        throw new UnsupportedOperationException();
    }

    public static void staticMethod(){
        System.out.println("static method");
    }
}

class MyClass implements IA {

    @Override
    public void abstractMethod() {
        System.out.println("implementation of abstract method");
    }

//    @Override
//    public void methodWithDefaultImpl() {
//    }
}
