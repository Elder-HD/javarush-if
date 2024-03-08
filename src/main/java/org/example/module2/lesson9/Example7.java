package org.example.module2.lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Example7 {
    public static void main(String[] args) {
        List<A2> list = new ArrayList<>();
        Map<A2, Integer> map = new HashMap<>();

        A2 key1 = new A2(1);
        A2 key2 = new A2(1);

        map.put(key1, 1);
        map.put(key2, 1);
        System.out.println(map.size());

        key1.value = 100;

        System.out.println(map.get(key1));
    }
}

class A2 {
    public  int value;

    public A2(int value) {
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
        A2 a2 = (A2) object;
        return value == a2.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
