package org.example.module1.lesson18;

import java.util.HashMap;
import java.util.Objects;

public class Example3 {
    public static void main(String[] args) {

        System.out.println("Example3.1 ____________________");
        A a1 = new A(1);
        A a2 = new A(1);

        HashMap<A, String> map = new HashMap<>();
        map.put(a1, "100");
        map.put(a2, "200");
        System.out.println(map.size());

        A a3 = new A(2);

        map.put(a3, "300");
        System.out.println(map.size());
        a3.setValue(1);

        System.out.println("======================");
        System.out.println(map.size()); //?
        System.out.println(map.get(a3));
    }
}

class A extends Object {
    private int value; // final


    public A(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        A that = (A) object;
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
