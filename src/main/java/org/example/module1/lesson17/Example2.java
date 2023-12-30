package org.example.module1.lesson17;

import java.util.HashSet;
import java.util.Objects;

public class Example2 {
    public static void main(String[] args) {
        HashSet<A> set = new HashSet<>();
        A e = new A(1);
        System.out.println(set.add(e));
        System.out.println(set.add(e));
        System.out.println(set.add(new A(1)));
        System.out.println(set.add(new A(1)));

        System.out.println(set.size());

        System.out.println("====================");
        System.out.println("remove");
        System.out.println(set.remove(new A(1)));
        System.out.println(set.remove(new A(2)));
        System.out.println("size: " + set.size());
        System.out.println("set is empty: " + set.isEmpty());

        System.out.println("=========================");
        System.out.println("contains");
        System.out.println(set.add(new A(100)));
        System.out.println(set.contains(new A(100)));
        System.out.println(set.contains(new A(101)));

        System.out.println("=========================");
        System.out.println("clear");
        System.out.println("size before clear: " + set.size());
        set.clear();
        System.out.println("size after clear: " + set.size());
    }
}

class A extends Object {
    private final int value;

    A(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
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
}
