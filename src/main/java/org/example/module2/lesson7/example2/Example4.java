package org.example.module2.lesson7.example2;

public class Example4 {
    public static void main(String[] args) {
        String product = "Apple";
        String productType;

        // java version < 12
        switch (product) {
            case "Apple":
            case "Peach":
                productType = "Fruit";
                break;
            case "Raspberry":
                productType = "Berry";
                break;
            default:
                productType = "other";
                break;
        }
        System.out.println(productType);
    }
}
