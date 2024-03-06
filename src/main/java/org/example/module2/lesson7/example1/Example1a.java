package org.example.module2.lesson7.example1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1a {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList("1", "2", "3")),
                new Order(Arrays.asList("1", "-2", "4")),
                new Order(Arrays.asList("o", "-2", "4", "56"))
        );

        // list orders -> stream orders --> stream items
        List<String> collect = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .collect(Collectors.toList());

        orders.stream()
                .parallel()
                .map(order -> order.getItems().stream().count())
                .collect(Collectors.toList());
    }
}

class Order {
    private final List<String> items;

    Order(List<String> items) {
        this.items = items;
    }

    public List<String> getItems() {
        return items;
    }
}
