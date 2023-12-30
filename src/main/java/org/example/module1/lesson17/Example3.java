package org.example.module1.lesson17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Example3 {
    public static void main(String[] args) {
        LinkedHashSet<B> set = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(new B(i));
        }

        System.out.println(set.size());

        Iterator<B> iterator = set.iterator();

        System.out.println("=".repeat(100));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class B {
    private final int value;


    B(int value) {
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
        B b = (B) object;
        return value == b.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                '}';
    }
}
