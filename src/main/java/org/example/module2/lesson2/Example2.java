package org.example.module2.lesson2;

public class Example2 {
    public static void main(String[] args) {
         new SuperClass();
        System.out.println("==============================");
         new SuperClass(null);
    }
}

class SuperClass extends Object{

    public SuperClass(){
        super(); // constructor from Object class
        System.out.println("constructor without parameters from SuperClass");
    }

    public SuperClass(String message){
        this();
        System.out.println("constructor with parameter from SuperClass");
    }
}

class SubClass extends SuperClass{

}
