package org.example.module1.lesson16;

public class Example2 {
    public static void main(String[] args) {
        String str = "blabla";

        Integer a = 100;// Integer.valueOf(100)
        int b = 3;
        Integer c = 10; // Integer.valueOf(10)

        Integer result = (a + b) * c;
        // Integer.valueOf((a.intValue() +b)*c.intValue())

        System.out.println(Integer.MAX_VALUE);
    }
}
