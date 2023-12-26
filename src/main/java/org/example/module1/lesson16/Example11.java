package org.example.module1.lesson16;

public class Example11 {
    public static void main(String[] args) {
        Container2<String>[] items = new Container2[10];

        Container2<Integer> integerContainer2 = new Container2<>(1);
        System.out.println(integerContainer2.getValue());
    }
}

class Container<E, K> {
    E value;
    K value2;
}

class Container2<E> {
    private final E value;

    Container2(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }
}
