package org.example.module2.lesson6;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Example6 {
    public static void main(String[] args) {

        List<String> list = null;
        Comparator<? super String> c = null;
        Collections.sort(list, c);

        Comparable<Order> comparable = (o1) -> 1;

    }
}

// Comparable vs
class Order implements Comparable<Order> {
    int price;
    String name;

    // 1) this > that return >0
    // 2) this< that return <0
    // 3) this = that return 0
    @Override
    public int compareTo(Order that) {
        return 0;
    }
}
