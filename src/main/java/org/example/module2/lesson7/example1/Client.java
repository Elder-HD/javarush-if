package org.example.module2.lesson7.example1;

class Client {
    // other fields
    private final Address address;

    Client(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        System.out.println("address getter");
        return address;
    }
}

