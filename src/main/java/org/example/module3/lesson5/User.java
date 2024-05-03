package org.example.module3.lesson5;

import lombok.Data;
import lombok.ToString;

@Data
public class User {
    private final String id;

    @ToString.Exclude
    private final String email;
}