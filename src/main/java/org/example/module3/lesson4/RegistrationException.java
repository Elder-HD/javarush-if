package org.example.module3.lesson4;

public class RegistrationException extends RuntimeException {

    public RegistrationException() {
        System.out.println("**********************************");
    }

    public RegistrationException(String message) {
        super(message);
    }
}
