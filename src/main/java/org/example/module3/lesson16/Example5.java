package org.example.module3.lesson16;

public class Example5 {
    public static void main(String[] args) {

    }
}

class SuperClass {

}

class ASubClass extends SuperClass {
}

class BSubClass extends SuperClass {
}

class CSubClass extends SuperClass {
}

class FactoryMethodHolder {

    public static SuperClass createInstance(String name) {
        switch (name) {
            case "A":
                return new ASubClass();
            case "B":
                return new BSubClass();
            case "C":
                return new CSubClass();
            default: throw  new IllegalArgumentException();
        }
    }
}

// A --> Integer
// B ---> Double
//C --> Float
interface AbstractFactory {
    SuperClass createInstance();

    Number createNumber();
}
