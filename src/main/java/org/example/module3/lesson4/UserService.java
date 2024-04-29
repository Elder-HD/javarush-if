package org.example.module3.lesson4;

public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final RegistrationValidator registrationValidator;
    private final UserDao userDao;

    public UserService(PasswordEncoder passwordEncoder,
                       RegistrationValidator registrationValidator, UserDao userDao) {
        this.passwordEncoder = passwordEncoder;
        this.registrationValidator = registrationValidator;
        this.userDao = userDao;
    }

    public void register(UserRegistrationDto user) {
        registrationValidator.validate(user);

        if(userDao.findByEmail(user.getEmail()).isPresent()){
            throw new RegistrationException("Such email is already used");
        }

        String encodePassword = passwordEncoder.encode(user.getPassword());
        userDao.save(user.getEmail(), encodePassword);
    }

}
