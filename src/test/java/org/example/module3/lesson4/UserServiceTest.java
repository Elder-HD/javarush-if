package org.example.module3.lesson4;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServiceTest {

    UserService userService;

    @Test
    void registerShouldSaveUserIntoStorage(){
       throw new UnsupportedOperationException();
    }

    @Test
    void registerShouldThrowExceptionIfValidationFailed(){
        UserRegistrationDto user = new UserRegistrationDto();
        user.setPassword("password123");
        user.setRepeatedPassword("password123");
        user.setEmail("someuser@gmail.com");

        RegistrationValidator registrationValidator = (u) -> {throw new RegistrationException();};
        userService = new UserService(null, registrationValidator, null);

        RegistrationException exception = assertThrows(RegistrationException.class,
                () -> userService.register(user));
    }

    @Test
    void registerShouldThrowExceptionWhenEmailIsAlreadyUsed(){
        UserRegistrationDto user = new UserRegistrationDto();
        user.setPassword("password123");
        user.setRepeatedPassword("password123");
        user.setEmail("someuser@gmail.com");

        RegistrationValidator registrationValidator = (u) -> {};
        UserDao userDao = new UserDao() {
            @Override
            public void save(String email, String password) {

            }

            @Override
            public Optional<User> findByEmail(String email) {
                return Optional.of(new User());
            }
        };
        userService = new UserService(null, registrationValidator, userDao);

        RegistrationException exception = assertThrows(RegistrationException.class,
                () -> userService.register(user));
        assertEquals(exception.getMessage(), "Such email is already used");
    }



}