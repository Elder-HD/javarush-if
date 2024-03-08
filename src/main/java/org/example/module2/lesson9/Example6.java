package org.example.module2.lesson9;

import java.util.Objects;

public class Example6 {
    public static void main(String[] args) {
        User user1 = new User("Taras", "Shevchenko");
        User user2 = new User("Taras", "Shevchenko");

        System.out.println(user1.toString());

        System.out.println(user1.equals(user2));

        int i = new Integer(1).hashCode();
        //hashCode return type int Integer.MIN, Integer.MAX

        //long value = Integer.MAX+1;
        //Integer.MIN, Integer.MAX
        //Integer.MAX+1 --> hashCode
        new Long(1l).hashCode();
    }
}

class User {
    private final String firstName;
    private final String lastName;

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        User that = (User) object;

        if (!Objects.equals(this.firstName, that.firstName)) {
            return false;
        }
        return Objects.equals(this.lastName, that.lastName);
    }

    // field1.hashCode()*simple_number1+field2.hashCode()*simple_number2
    // field1.hashCode()+field2.hashCode()
    // firstName=Taras lastName=Shevchenko, fistName=Shevchenko lastName=Taras
    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Dog {
    int age;
    String name;
    String description;

    // equals --> true   o1.hashCode = o2.hashCode
    // hashCode the same during time
    // equals --> false
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        // * getClass() vs instanceOf ??
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Dog dog = (Dog) object;
        return age == dog.age
                && Objects.equals(name, dog.name)
                && Objects.equals(description, dog.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, description);
    }
}
