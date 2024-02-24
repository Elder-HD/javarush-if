package org.example.module2.lesson5;

public class Example2 {
    public static void main(String[] args) {
        IntContainer intContainer = new IntContainer();
        intContainer.setValue(1);


        StringContainer stringContainer = new StringContainer();
        stringContainer.setValue("ddd");


        Container container = new Container(Integer.class);
        container.setValue(1);
        container.setValue("hello");


        GenericContainer<Integer> container1 = new GenericContainer<>();
        container1.setValue(1);
    }
}

class IntContainer {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class DoubleContainer {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

class StringContainer {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Container {
    private Object value;
    private final Class aClass;

    Container(Class aClass) {
        this.aClass = aClass;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        if (value.getClass() == aClass) {
            this.value = value;
        } else {
            throw new RuntimeException();
        }
    }
}

class GenericContainer<T> {
    //T, V, E, K, I, O
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
            this.value = value;
        }
    }

