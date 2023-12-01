package org.example.module1.lesson7;

public class Example4 {
    public static void main(String[] args) {
        String[] names = new String[4];

        for (int i = 0; i < names.length; i++) {
            if(i<1|| i>2){
                continue;
            }
            names[i] = "Alex" + i;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
