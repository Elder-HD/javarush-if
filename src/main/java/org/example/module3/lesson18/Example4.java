package org.example.module3.lesson18;

public class Example4 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.c=c;
        c.b=b;

    }
}

class B {
    public C c;
}

class C{
    public B b;
}


