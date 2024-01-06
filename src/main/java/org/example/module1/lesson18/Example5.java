package org.example.module1.lesson18;

import java.util.Objects;
import java.util.TreeMap;

public class Example5 {
    public static void main(String[] args) {
        TreeMap<B, Integer> map = new TreeMap<>();
        map.put(new B(1), 1);
    }
}

class B implements Comparable<B> {
    private final int value;

    B(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        B b = (B) object;
        return value == b.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(B that) {
        // this = that ---> 0
        // this > that ---> >0 (1)
        // this < that ----> <0 (-1)
        return this.value - that.value;
    }
}
