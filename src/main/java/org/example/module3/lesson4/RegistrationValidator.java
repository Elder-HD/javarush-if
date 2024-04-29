package org.example.module3.lesson4;

@FunctionalInterface
public interface RegistrationValidator {
    void validate(UserRegistrationDto user) throws RegistrationException;
}
