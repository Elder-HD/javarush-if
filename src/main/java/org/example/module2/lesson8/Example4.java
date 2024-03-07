package org.example.module2.lesson8;

public class Example4 {

    private static final String DELIMITER = "=".repeat(100);

    public static void main(String[] args) {
        new A();
        System.out.println(DELIMITER);
        new B();
        System.out.println(DELIMITER);
        new B();
    }
}

/**
 * if comment line 8 new A();
 * ====================================================================================================
 * static block A
 * static block B
 * non static block A
 * constructor A
 * non static block B
 * constructor B
 * ====================================================================================================
 * non static block A
 * constructor A
 * non static block B
 * constructor B
 */

class A {
    static {
        System.out.println("static block A");
//        boolean isTrue = true;
//
//        if(isTrue){
//            throw new Exception();
//        }
    }

    {
        System.out.println("non static block A");
    }

    public A() {
        System.out.println("constructor A");
    }
}

class B extends A {
    static {
        System.out.println("static block B");
    }

    {
        System.out.println("non static block B");
    }

    public B() {
        System.out.println("constructor B");
    }
}
