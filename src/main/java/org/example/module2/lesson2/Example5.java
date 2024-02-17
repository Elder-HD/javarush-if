package org.example.module2.lesson2;

public class Example5 {
    public static void main(String[] args) {

    }
}

class Pet {

    public void say() {
        System.out.println("say");
    }
}

class Cat extends Pet {

    @Override
    public void say() {
        System.out.println("miau-miau");
    }
}

class Dog extends Pet{
    @Override
    public void say() {
        System.out.println("gaf-gaf");
    }
}
