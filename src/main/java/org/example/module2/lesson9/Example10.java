package org.example.module2.lesson9;

public class Example10 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat(1, "Barsik");
        Cat clone = cat.clone();
        System.out.println(clone);
    }
}

class Cat implements Cloneable {

    private final int age;
    private final String name;

    public Cat(int age, String name) {
        System.out.println("create cat: age=" + age + ", name=" + name);
        this.age = age;
        this.name = name;
    }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return (Cat)super.clone();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


enum Type{

}
