package org.example.module3.lesson4;

import java.util.Optional;

public class Example1 {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new SimpleEncoder();
        RegistrationValidator registrationValidator = (u) -> {};
        UserDao userDao = new UserDao() {
            @Override
            public void save(String email, String password) {

            }

            @Override
            public Optional<User> findByEmail(String email) {
                return Optional.empty();
            }
        };
        UserService userService = new UserService(passwordEncoder, registrationValidator, userDao);

        UserRegistrationDto user = new UserRegistrationDto();
        user.setPassword("password123");
        user.setRepeatedPassword("password123");
        user.setEmail("someuser@gmail.com");

        userService.register(user);


    }
}
