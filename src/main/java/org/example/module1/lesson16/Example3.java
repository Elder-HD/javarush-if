package org.example.module1.lesson16;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int a = 10347891;

        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.valueOf(a));

        int b = Integer.parseInt("12", 3);
        System.out.println(b);
        // 112 (10) = 1*10^2+ 1*10^1+  2*10^0
        //1*3^1+ 2*3^0=5
        //
    }
}
