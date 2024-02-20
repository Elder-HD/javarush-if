package org.example.module2.lesson4.example7;

public class Example7 {
}

class MyClass implements IA, IB{

    @Override
    public void method() {
        IA.super.method();
    }
}
interface IA{
  default void method(){
      System.out.println("method");
  }
}

interface IB{
    void method();
}
