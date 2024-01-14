package org.example.module1.lesson21;

public class Example12 {
    public static void main(String[] args) {
        convertCheckIntoUncheckedException();
    }


    private static void convertCheckIntoUncheckedException() {
        try {
            throw new MyException(); // we can invoke some method that throws checked exception here
        } catch (MyException e) {
            throw new RuntimeException(e); // * wrap checked exception into unchecked
        }
    }
}

class MyException extends Exception {

}
