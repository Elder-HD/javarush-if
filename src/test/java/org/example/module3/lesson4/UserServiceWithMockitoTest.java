package org.example.module3.lesson4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

//@RunWith(MockitoRunner.class)
@ExtendWith(MockitoExtension.class)
class UserServiceWithMockitoTest {

    private static final String USER_EMAIL = "someuser@gmail.com";
    private static final String PASSWORD = "password123";
    private static final String ENCODED_PASSWORD = "encoded_password";
    private static final String REPEATED_PASSWORD = "password123";

    @InjectMocks
    UserService userService;

    @Mock
    RegistrationValidator registrationValidator;

    @Mock
    UserDao userDao;

    @Mock
    PasswordEncoder passwordEncoder;

    @Test
    void registerShouldSaveUserIntoStorage() {
        doNothing().when(registrationValidator).validate(any());
        doReturn(Optional.empty()).when(userDao).findByEmail(USER_EMAIL);
        doReturn(ENCODED_PASSWORD).when(passwordEncoder).encode(PASSWORD);
        UserRegistrationDto user = initUser();

        userService.register(user);

        verify(userDao, times(1)).save(USER_EMAIL, ENCODED_PASSWORD);
//        verify(userDao, never()).save(USER_EMAIL, ENCODED_PASSWORD);
//        verify(userDao, timeout(100)).save(USER_EMAIL, ENCODED_PASSWORD);
    }

    @Test
    void registerShouldThrowExceptionIfValidationFailed() {
        UserRegistrationDto user = initUser();

//        Mockito.doThrow(new RegistrationException())
//                .when(registrationValidator)
//                .validate(ArgumentMatchers.any());

        Mockito.doThrow(RegistrationException.class)
                .when(registrationValidator)
                .validate(Mockito.any());

        RegistrationException exception = assertThrows(RegistrationException.class,
                () -> userService.register(user));

        Mockito.verifyNoInteractions(userDao, passwordEncoder);
    }

    @Test
    void registerShouldThrowExceptionWhenEmailIsAlreadyUsed() {
        UserRegistrationDto user = initUser();

//        Mockito.doReturn(Optional.of(new User())).when(userDao).findByEmail(email); // option 1
        Mockito.when(userDao.findByEmail(USER_EMAIL)).thenReturn(Optional.of(new User())); // option 2

        RegistrationException exception = assertThrows(RegistrationException.class,
                () -> userService.register(user));
        assertEquals(exception.getMessage(), "Such email is already used");
    }

    private static UserRegistrationDto initUser() {
        UserRegistrationDto user = new UserRegistrationDto();
        user.setPassword(PASSWORD);
        user.setRepeatedPassword(REPEATED_PASSWORD);
        user.setEmail(USER_EMAIL);
        return user;
    }


}