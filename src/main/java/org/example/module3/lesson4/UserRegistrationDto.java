package org.example.module3.lesson4;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String email;
    private String password;
    private String repeatedPassword;
}
