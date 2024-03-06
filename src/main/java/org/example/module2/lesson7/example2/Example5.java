package org.example.module2.lesson7.example2;

public class Example5 {
    //* null argument with case switch
    public static void main(String[] args) {
        String product = null;

        // java version < 12
        System.out.println(getProductType(product));

        // java version 14
        System.out.println(getProductType2(product));
    }

    // java version < 12
    private static String getProductType(String product) {
        switch (product) {
            case "Apple":
            case "Peach":
                return "Fruit";
            case "Raspberry":
                return "Berry";
            default:
                return "other";
        }
    }

    // java version = 14
    private static String getProductType2(String product) {
        return switch (product) {
            case "Apple", "Peach" -> "Fruit";
            case "Raspberry" -> "Berry";
            case "Some" -> {
                System.out.println("some case");
                yield  "Berry";
            }
            default -> "other";
        };
    }
}
