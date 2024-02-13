package org.example.module2.lesson1;

import java.time.LocalDate;
import java.util.Objects;

public class Example1 {
    public static void main(String[] args) {

    }
}

// state = fields
// behavior = methods(not getters or setters)
class User {
    private final String firstName;
    private final String lastName;
    private final LocalDate birth;
    private final String password;

    private final String email;


    public User(String firstName, String lastName, LocalDate birth, String password, String email) {
        if (email == null || !email.contains("@")) { // regex
            throw new IllegalArgumentException("");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.password = password;
        this.email = email;
    }

    // public API
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getYears() {
        LocalDate now = LocalDate.now();

        return now.getYear() - birth.getYear();
    }

    public boolean areCredentialsValid(String email, String password) {
        return Objects.equals(email, this.email) && Objects.equals(password, this.password);
    }
}
