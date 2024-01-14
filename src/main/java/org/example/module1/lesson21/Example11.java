package org.example.module1.lesson21;

public class Example11 {
    public static void main(String[] args) throws RuntimeException {
        Object object = null;
        try {
            validateOnNull(object);
        } catch (RuntimeException e){

        }

    }


    private static void validateOnNull(Object object) throws RuntimeException {
        if (object == null) {
            throw new RuntimeException();// this is unchecked exception
        }
    }
}
