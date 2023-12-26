package org.example.module1.lesson16;

public class Example1 {
    public static void main(String[] args) {
        byte a = 0;

        Byte a1 = new Byte(a);
        a1 = null;
        // |   |    |

        Integer i1 = new Integer(1);
    }
}

class IntWrapper {
    private final int value;

    IntWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
