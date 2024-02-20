package org.example.module2.lesson4.example5;

import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {

    }
}

class MyClass implements B {

    @Override
    public Integer method()  {
        return null;
    }
}

interface A {
    Object method() throws Exception;
}

interface B extends A {
    Number method() throws IOException;
}
