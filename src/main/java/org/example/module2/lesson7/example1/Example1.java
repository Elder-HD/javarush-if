package org.example.module2.lesson7.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Client client1 = new Client(new Address(new City("Kyiv")));
        Client client2 = new Client(new Address(new City("Lviv")));
        Client client3 = new Client(new Address(null));
        Client client4 = new Client(null);
        Client client5 = null;
        Client client6 = new Client(new Address(new City("Kyiv")));

        List<Client> clients = Arrays.asList(client1, client2, client3, client4, client5, client6);

        //Collection
        //Predicate: boolean test(T t)
        //Objects
        // c -> c!=null  ===> Objects::nonNull
        Stream<Client> clientStream = clients.stream()
                .filter(Objects::nonNull);
        long count = clientStream
                .count();

        System.out.println(count);
        System.out.println("===========================================");
        List<Address> addresses = clients.stream()
                .filter(Objects::nonNull)
                .map(Client::getAddress)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());


        for (Address address : addresses) {
            System.out.println(address);
        }

        System.out.println("=====================================");

        Stream<Client> stream = clients.stream();

        long count1 = stream.count();
        System.out.println("count1: " + count1);

        clients.stream().filter(Objects::nonNull).map(client -> client.getAddress()).forEach(System.out::println);

        List<String> cities = clients.stream()
                .filter(Objects::nonNull)
                .map(Client::getAddress)
                .filter(Objects::nonNull)
                .map(Address::getCity)
                .filter(Objects::nonNull)
                .map(City::getName)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(cities);

        System.out.println("=============================");

        boolean result = clients.stream()
                .filter(Objects::nonNull)
                .map(Client::getAddress)
                .filter(Objects::nonNull)
                .map(Address::getCity)
                .filter(Objects::nonNull)
                .map(City::getName)
                .distinct()
                .allMatch(Objects::nonNull);


        Supplier<Container<Client>> supplier = Container::new;
        BiConsumer<Container<Client>, ? super Client> accumulator = Container::add;
        BiConsumer<Container<Client>, Container<Client>> combiner = Container::merge;
        Container<Client> container = clients.stream().collect(supplier, accumulator, combiner);

    }
}

class Container<E> {
    private final List<E> list = new ArrayList<>();

    public Container(){

    }

    public void add(E element){
        list.add(element);
    }


    public Container<E> merge(Container<E> that){
        this.list.addAll(that.list);

        return this;
    }


}
