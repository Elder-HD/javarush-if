package org.example.module1.lesson7;

public class Example10 {
    public static void main(String[] args) {
        int[] a = new int[10];

        int[] b = new int[10];

        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i * i;
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // c[0] = a[9]
        for (int i = 0; i < a.length; i++) {
            int maxIndex = a.length - 1;
            c[i] = a[maxIndex - i];
//            c[0] = a[a.length - 1 -0];
        }

        System.out.println("=============");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println();

        System.out.println("=============");
        for (int i = 0; i < a.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
