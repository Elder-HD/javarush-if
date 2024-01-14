package org.example.module1.lesson21;

public class Example6 {
    public static void main(String[] args)  {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
