package org.example.module3.lesson10;

import java.util.List;

public class DemoRunner {

    public static void main(String[] args) {
        GoRestUserClientImpl goRestUserClient = new GoRestUserClientImpl();
        Page page = Page.builder()
                .withPage(1)
                .withPerPage(2)
                .build();

        Response<List<User>> response = goRestUserClient.findAll(page);
        System.out.println("status: " + response.getStatusCode());
        System.out.println("=".repeat(100));
        response.getBody().forEach(System.out::println);
        System.out.println("=".repeat(100));


        System.out.println("---------------------------");

        User user = User.builder()
                .withEmail("lesia.ukrainka2@gmail.com")
                .withName("Lesia Ukrainka")
                .withStatus("active")
                .withGender("female")
                .build();

        Response<User> newUserResponse = goRestUserClient.createNewUser(user);
        System.out.println("status code:" + newUserResponse.getStatusCode());
        System.out.println("new user: "+newUserResponse.getBody());
    }
}
