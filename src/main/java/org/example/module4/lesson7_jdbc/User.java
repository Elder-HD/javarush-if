package org.example.module4.lesson7_jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private String firstName;
    private String lastname;
    private String email;
    private int age;
    private String phoneNumber;
    private String city;
}
