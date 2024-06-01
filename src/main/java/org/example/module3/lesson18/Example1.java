package org.example.module3.lesson18;

public class Example1 {
    public static void main(String[] args) {
        Integer a1 = 100; //Integer.valueOf
        Integer a2 = 100;
        Integer.valueOf(100);

        System.out.println("==============");
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));


        System.out.println("==============");
        Integer b1 = 1000;
        Integer b2 = 1000;
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        System.out.println("========================");
        String str1 ="lesson";
        String str2 ="lesson";
        String str3= new String("lesson");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
    }
}
