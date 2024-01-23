package org.example.module1.lesson25;

public class Example2 {
    public static void main(String[] args) {
        int retryNumber = 5;
        boolean isWorking = true;

        while (isWorking) {
            try {
                // some functionality
                isWorking = false;
            } catch (Exception e) {
                retryNumber--;
                if (retryNumber == 0) {
                    isWorking = false;
                }
            }

        }
    }
}
