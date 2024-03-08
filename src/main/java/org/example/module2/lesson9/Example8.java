package org.example.module2.lesson9;

public class Example8 {
    public static void main(String[] args) {
        Address address = new Address("Kyiv");
        Client client = new Client(address);
        System.out.println(client);
        client.getAddress().setCity("Lviv");
        System.out.println(client);

        address.setCity("warning");
        System.out.println(client);
    }
}

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}

final class Client {

    private final Address address;

    Client(Address address) {
        this.address = copyAddress(address);
    }

    private static Address copyAddress(Address address) {
        return address == null ? null : new Address(address.getCity());
    }

    public Address getAddress() {
        return copyAddress(this.address);
    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }


    @Override
    public String toString() {
        return "Client{" +
                "address=" + address +
                '}';
    }
}
