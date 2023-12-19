package org.example.module1.lesson13;

public class Example1 {
    public static void main(String[] args) {
        User user1 = new User("Alex", "Ivchenko");
        user1.setActive(true);

        User user2 = new User("Petro", "Shevchenko");
        user2.setActive(false);

        User user3 = new User("Ivan");
        user3.setSurname("Shevchenko");
        user3.setSurname("Sh");

        System.out.println(user1.getName() + " " + user1.getSurname());
        System.out.println(user2.getName() + " " + user2.getSurname());
        System.out.println(user3.getName() + " " + user3.getSurname());
    }
}

class User {

    private  String name;
    private String surname;
    private boolean active;

    public User(String name, String surname) {
        //....
        System.out.println("create user");
        this.name = name;
        this.surname = surname;
    }

    public User(String name) {
        this.name = name;
        //this.surname =null;
    }


//    public User(String surname) {
//        this.name = null;
//        this.surname = surname;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}