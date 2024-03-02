package org.example.module2.lesson6;

public class Example3 {
    public static void main(String[] args) {
        My3Interface my3Interface = new My3Interface() {
            @Override
            public String print(int times) {
                return "*".repeat(times);
            }
        };


        // step 1
        My3Interface item2 = (int times) -> {
                return "*".repeat(times);
            };

        //step 2
        My3Interface item3 = (int times) -> "*".repeat(times);

        //step 3
        My3Interface item4 = (times) -> "*".repeat(times);

        //step 3.5 (just if we have 1 parameter)
        My3Interface item5 = times -> "*".repeat(times);

    }
}

@FunctionalInterface
interface My3Interface {
    String print(int v);

    default String print(String message, int times) {
        return message.repeat(times);
    }

    static void staticMethod() {

    }
}
