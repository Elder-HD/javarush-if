package org.example.module1.lesson27;

import java.util.HashMap;
import java.util.Objects;

public class Example3 {

    public static void main(String[] args) {
        HashMap<Key, Integer> keyToValue = new HashMap<>();
        Key key1 = new Key(1);
        Key key2 = new Key(2);

        keyToValue.put(key1, 1);
        keyToValue.put(key2, 2);

        System.out.println("==============");
        System.out.println(keyToValue.get(key1));
        System.out.println(keyToValue.get(key2));
        System.out.println("==================");
        System.out.println(keyToValue.get(new Key(1)));
        System.out.println(keyToValue.get(new Key(2)));
        System.out.println("=================");
        key1.setValue(100);
        System.out.println(keyToValue.get(key1));
    }
}

class Key {
    private int value;

    public Key(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
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
        Key key = (Key) object;
        return value == key.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
