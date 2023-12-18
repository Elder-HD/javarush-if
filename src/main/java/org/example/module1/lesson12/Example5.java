package org.example.module1.lesson12;

public class Example5 {
    public static void main(String[] args) {
        new User();
        User a = new User();
        a.firstName = "Alex";
        a.lastName = "Shevchyk";
        a.printInfo();
    }
}

class User {
    String firstName;
    String lastName;

    public void printInfo() {
        System.out.println(firstName + " " + lastName);
    }
}
