package org.example.module1.lesson21;

public class Example9 {
    public static void main(String[] args) {

        boolean isThrown = false; // try true
        try {
            if (isThrown) {
                throw new RuntimeException();
            }
        } catch (RuntimeException e){
            System.out.println("catch exception");
        } finally {
            System.out.println("finally block");
        }
    }
}
