package org.example.module2.lesson8;

public class Example3 {
    public static void main(String[] args) {
        new MyClass3();
        System.out.println("=".repeat(100));
        new MyClass3();
    }


}

class MyClass3 {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("non-static block");
    }

    public MyClass3() {
        System.out.println("constructor");
    }
}