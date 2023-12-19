package org.example.module1.lesson13;

import java.util.Objects;

public class Example4 {
    public static void main(String[] args) {
        Client alex = new Client("Alex");
        Client bob = new Client("Alex");

        System.out.println(Client.getCounter());

        System.out.println("=".repeat(100));
        System.out.println(alex.getId());
        System.out.println(bob.getId());

        System.out.println(alex == bob);

        System.out.println(alex.equals(bob));
    }
}


class Client {

    private static int counter = 0;

    private final int id;

    private final String name;

    public Client(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || this.getClass() != that.getClass()) {
            return false;
        }

        Client client = (Client) that;

        if (id != client.id) {
            return false;
        }
        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return 31 * id + (name != null ? name.hashCode() : 0);
    }
}
