package org.example.module2.lesson7.example1;

class Address {
    private final City city;

    Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                '}';
    }
}
