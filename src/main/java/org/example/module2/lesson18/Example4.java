package org.example.module2.lesson18;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Example4 {
    public static void main(String[] args) {
        User user = new User();
        int age = user.getAge();
    }
}


@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
//@NoArgsConstructor
//@Data
class User {

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private String firstname;
    private String lastname;

    private String email;

    private int age;

    public User(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }
}
