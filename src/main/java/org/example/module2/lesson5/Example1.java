package org.example.module2.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        addStringToList(list, "hello");
        list.add("hi");

        Object e = new Object();
        if(e instanceof String){
            list.add((String)e);
        }

        System.out.println(list.size());
    }

    private static void addStringToList(List list, String str) {
        list.add(str);
    }

    private static void addObjectToList(List list, Object str) {
        list.add(str);
    }
}
