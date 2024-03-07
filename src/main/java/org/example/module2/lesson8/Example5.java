package org.example.module2.lesson8;

public class Example5 {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Pet pet2 = new Dog();
        Dog pet3 = new Dog();

        pet1.say();
        pet2.say();
        pet3.say();

        System.out.println("=".repeat(100));

        System.out.println(pet1.age);
        System.out.println(pet2.age);
        System.out.println(pet3.age);
    }
}

class Pet {
    int age = 1;

    public void say() {
        System.out.println("...");
    }
}

class Dog extends Pet {
    int age = 2;

    @Override
    public void say() {
        System.out.println("gaf-gaf");
    }

    public void info() {
        System.out.println("age super: " + super.age);
        System.out.println("age this: " + this.age);
    }

}
