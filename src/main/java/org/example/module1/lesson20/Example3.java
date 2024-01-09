package org.example.module1.lesson20;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(UserType.CLIENT.getRole());
        UserType.CLIENT.setRole("blabla");

        System.out.println(UserType.CLIENT.getRole());
//        UserType demoRole = new UserType("demo_role");

    }
}

enum UserType {
    CLIENT("client_role"),
    MANAGER("manager_role");

    private String role; // use final modifier and remove setter

    private UserType(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
