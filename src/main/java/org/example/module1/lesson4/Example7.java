package org.example.module1.lesson4;

public class Example7 {
    public static void main(String[] args) {
        int temperature = 9;
        if (temperature > 20) { //(20, --->
            System.out.println("одягнути сорочку");
        } else { // (<----, 20]
            if (temperature > 10) { // (10, 20]
                System.out.println("одягнути светр");
            } else { //(<-----,10]
                if (temperature > 0) //(0, 10]
                    System.out.println("одягнути плащ");
                else // тут температура менше 0
                    System.out.println("одягнути пальто");
            }
        }
    }
}
