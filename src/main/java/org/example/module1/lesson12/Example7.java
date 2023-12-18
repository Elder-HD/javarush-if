package org.example.module1.lesson12;

public class Example7 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        SuperClass superClass = new SuperClass();

        SuperClass a1 = a;

        //byte ---> short ---> int ---> long

        SuperClass[] items = {a, b, c};
        for (int i = 0; i < items.length; i++) {
            items[i].method();
        }
    }
}

class SuperClass {
    int value;


    public void method() {
        System.out.println("method");
    }
}

class A extends SuperClass {
    int value2;


    public void method2() {
        System.out.println("method2 - class A");
    }

    @Override
    public void method() {
        System.out.println("method - class A");
    }
}

class B extends SuperClass {
    String value2;

    public String method3() {
        return "method3 - class B";
    }

    @Override
    public void method() {
        System.out.println("method - class B");
    }
}

class C extends SuperClass {

}
