package org.example.module3.lesson16;

public class Example6 {
    public static void main(String[] args) {
        MyClass item = new MyClass("Hello");
        MyClass clone = item.clone();

        System.out.println(item == clone);
        System.out.println(clone.toString());

    }
}

class MyClass /*implements Cloneable*/{

    private String name;

    public MyClass(String name) {
        System.out.println("constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                '}';
    }

    //@Override
    public MyClass clone() {
        try {
            return (MyClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
