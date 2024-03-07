package org.example.module2.lesson8;

public class Example2 {
    public static void main(String[] args) {

    }
}

class MyClass2 {

    // non-static block of initialization
    {
        boolean isTrue = true;
        if (isTrue) {
            throw new Exception();
        }
    }

    public MyClass2() throws Exception {
        super();
        // non-static block of initialization is invoked
        System.out.println("constructor");
    }
}
