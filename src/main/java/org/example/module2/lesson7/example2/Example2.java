package org.example.module2.lesson7.example2;

import java.lang.reflect.Array;

public class Example2 {
    public static void main(String[] args) {
        Object reference1 = "";
        Object reference2 = 1; //int --> Integer (boxing)
        Object reference3 = new Object();

        Object[] objects = new Object[10];
        Object reference4 = objects;

        String str ="blabla";

        System.out.println(reference1 instanceof String);
        System.out.println(reference2 instanceof Object);
        System.out.println(reference2 instanceof Number);
        System.out.println(reference3 instanceof Integer);
        System.out.println(reference4 instanceof Array);
        System.out.println(null instanceof Object);
//        System.out.println(str instanceof Integer);
    }
}

class ObjectContainer {
    public Object value;
    //methods
}
