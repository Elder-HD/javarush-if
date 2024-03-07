package org.example.module2.lesson8;

public class Example8 {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.a);
        System.out.println(d.b);
        System.out.println(d.c);
    }
}

class D {
    public int a = sum() + 1;
    public int b = sum() - a;
    public int c = sum() - a - b;

    public int sum() {
        int temp = (a + b + c);
        System.out.println("temp: " + temp);
        return temp;
    }
}
