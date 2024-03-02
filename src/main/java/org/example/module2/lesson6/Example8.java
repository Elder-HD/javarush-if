package org.example.module2.lesson6;

import java.util.Optional;
import java.util.function.Supplier;

public class Example8 {
    public static void main(String[] args) {
        City city = new City("Lviv");
//        Address address = new Address(city);
        Address address = null;
        Client client = new Client(address);
//client.getAddress().getCity().getName()

        String cityName = null;
        if (client != null) {
            Address address1 = client.getAddress();
            if(address1!=null) {
                City city1 = address1.getCity();
                if(city1!=null) {
                    cityName = city1.getName();
                }
            }
        }
        System.out.println(cityName);

        String s = Optional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .orElse(null);


        Supplier<String> stringSupplier = () -> null;

        Supplier<String> stringSupplier2 = new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        };

        Optional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .orElseGet(stringSupplier2);

        Optional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .orElseThrow();


        Optional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
//                .orElseThrow(IllegalArgumentException::new);
                .orElseThrow(() -> new IllegalArgumentException("my message"));


        Optional.ofNullable(client)
                .map(Client::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .ifPresent(System.out::println);

    }
}

class Client {
    // other fields
    private final Address address;

    Client(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private final City city;

    Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }
}

class City {
    private final String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
