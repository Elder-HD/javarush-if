package org.example.module3.lesson4;

import java.util.Optional;

//CRUD
public interface UserDao {

    void save(String email, String password);


    Optional<User> findByEmail(String email);
}
