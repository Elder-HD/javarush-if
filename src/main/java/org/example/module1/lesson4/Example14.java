package org.example.module1.lesson4;

public class Example14 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("==");
        System.out.println(a == b);
        System.out.println(a == d);
        System.out.println(a == c);

        System.out.println("equals");
        System.out.println(a.equals(b));
        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
    }
}
