package org.example.module1.lesson20;

public class Example5 {

    public static void main(String[] args) {
        int i = 1;

        if (i==1 ||i == 2) {
            System.out.println("2_");
        } else if (i == 3) {
            System.out.println("_3");
        } else {
            System.out.println("else");
        }

        System.out.println("==================");
        switch (i){
            case 1:

            case 2: {
                System.out.println("2_");
                System.out.println();
                break;
            }
            case 3:
                System.out.println("_3");
                break;
            default:
                System.out.println("else");
                break;
        }

        System.out.println("End");
    }
}
