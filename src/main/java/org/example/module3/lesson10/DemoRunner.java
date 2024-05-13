package org.example.module3.lesson10;

import java.util.List;

public class DemoRunner {
    public static GoRestUserClientImpl goRestUserClient = new GoRestUserClientImpl();

    public static void main(String[] args) {
        User user = User.builder()
                .withEmail("gnat.polish@gmail.com")   // check for unique e-mail to create new User
                .withName("Gnat Polishchuk")
                .withStatus("active")                 // [active, inactive]
                .withGender("male")                   // [male, female]
                .build();

        checkFindAllMethod(1, 2);
        checkCreateNewUserMethod(user);
        checkFindUserByIdMethod(6904630L);
        checkUpdateUserMethod(user, 6904630L);
        checkDeleteByIdMethod(6904630L);

    }

    private static void checkFindAllMethod(int pageNr, int perPage) {
        Page page = Page.builder()
                .withPage(pageNr)
                .withPerPage(perPage)
                .build();

        Response<List<User>> response = goRestUserClient.findAll(page);
        System.out.println("status: " + response.getStatusCode());
        System.out.println("=".repeat(100));
        response.getBody().forEach(System.out::println);
        System.out.println("=".repeat(100));
    }

    private static void checkCreateNewUserMethod(User user) {
        Response<User> response = goRestUserClient.createNewUser(user);
        System.out.println(response);
    }

    private static void checkFindUserByIdMethod(Long id) {
        Response<User> response = goRestUserClient.findUserById(id);
        System.out.println("status: " + response.getStatusCode());
        System.out.println(response.getBody());
    }

    private static void checkUpdateUserMethod(User user, Long id) {
        user.setId(id);
        Response<User> response = goRestUserClient.updateUserDetails(user);
        System.out.println(response);
    }

    private static void checkDeleteByIdMethod(Long id) {
        Response<Void> response = goRestUserClient.deleteById(id);
        System.out.println("status code: " + response.getStatusCode());
    }
}
