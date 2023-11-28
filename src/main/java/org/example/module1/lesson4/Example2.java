package org.example.module1.lesson4;

public class Example2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println("AND");
        System.out.println("===================");
        System.out.println("true&&true=" + (true && true));
        System.out.println("true&&false=" + (true && false));
        System.out.println("false&&true=" + (false && true));
        System.out.println("false&&false=" + (false && false));
        System.out.println();
        System.out.println("OR");
        System.out.println("===================");
        System.out.println("true||true=" + (true || true));
        System.out.println("true||false=" + (true || false));
        System.out.println("false||true=" + (false || true));
        System.out.println("false||false=" + (false || false));


        System.out.println();
        System.out.println("NOT");
        System.out.println("===================");
        System.out.println("!true=" + !true);
        System.out.println("!false=" + !false);



        System.out.println();
        System.out.println("*****************");
        System.out.println("XOR");
        System.out.println("===================");
        System.out.println("true^true=" + (true ^ true));
        System.out.println("true^false=" + (true ^ false));
        System.out.println("false^true=" + (false ^ true));
        System.out.println("false^false=" + (false ^ false));

    }
}
