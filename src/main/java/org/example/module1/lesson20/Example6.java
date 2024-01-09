package org.example.module1.lesson20;

public class Example6 {

    public static void main(String[] args) {
        int i = 1;

        String message1 = methodIfElse(i);
        System.out.println(message1);

        System.out.println("==================");
        String message2 = methodSwitch(i);
        System.out.println(message2);
    }

    private static String methodSwitch(int i) {
        switch (i) {
            case 1:
            case 2:
                return "2_";
            case 3:
                return "_3";
            default:
                return "else";
        }

    }

    private static String methodIfElse(int i) {
        if (i == 1 || i == 2) {
            return "2_";
        } else if (i == 3) {
            return "_3";
        } else {
            return "else";
        }
    }
}
