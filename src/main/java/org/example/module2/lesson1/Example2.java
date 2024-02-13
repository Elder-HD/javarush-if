package org.example.module2.lesson1;

public class Example2 {
    public static void main(String[] args) {
        Pet cat = new Cat("Tom", 4);
        Pet dog = new Dog("Reks", 20);

        Pet[] pets = {cat, dog};

        for (Pet pet : pets) {
            pet.say();
        }
    }
}

class Pet {

    String name;

    int weight;

    public Pet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void move() {
        System.out.println("move");
    }

    public void say() {
        System.out.println("?????");
    }
}

class Dog extends Pet {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void say() {
        System.out.println("Gaf-Gaf");
    }
}

class Cat extends Pet {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void say() {
        System.out.println("May-May");
    }
}
