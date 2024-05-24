package org.example.module3.lesson16;

public class Example3 {
}

interface UserService {
    String findById(Integer id);
}

class UserServiceImpl implements UserService {

    @Override
    public String findById(Integer id) {
        return "user";
    }
}

class StaticProxyUserService implements UserService {

    private final UserService userService;

    StaticProxyUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String findById(Integer id) {
        long start = System.nanoTime();
        String result = userService.findById(id);
        long end = System.nanoTime();

        System.out.println("time to execute: " + (end - start) + "nanoSec");
        return result;
    }

}
