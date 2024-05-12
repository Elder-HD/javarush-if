package org.example.module3.lesson10;

import java.util.List;

//1) implement 3 methods
//2)
public interface GoRestUserClient {

    Response<List<User>> findAll(Page page);

    Response<User> createNewUser(User user);


    //TODO:https://gorest.co.in/
    Response<User> findUserById(Long id);

    //TODO:https://gorest.co.in/
    Response<User> updateUserDetails(User user);

    //TODO:https://gorest.co.in/
    Response<Void> deleteById(Long id);
}
