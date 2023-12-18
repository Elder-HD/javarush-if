package org.example.module1.lesson12;

public class Example6 {
    public static void main(String[] args) {
        Client client = new Client("Alex", "Iva");
        client.printInfo();
    }

}


class Client {
    private String firstName;
    private String lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName);
    }
}