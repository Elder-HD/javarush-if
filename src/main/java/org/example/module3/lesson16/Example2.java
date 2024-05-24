package org.example.module3.lesson16;

public class Example2 {
    public static void main(String[] args) {
        EmptyPizza emptyPizza = new EmptyPizza();

       new PizzaWithCheese(new PizzaWithBeacon(new PizzaWithCheese(emptyPizza))).make();
    }
}

interface IPizza{
    void make();
}

class EmptyPizza implements IPizza {

    @Override
    public void make() {
        System.out.println("empty pizza");
    }
}

class PizzaWithCheese implements IPizza{
    private  final IPizza pizza;

    PizzaWithCheese(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void make() {
        pizza.make();
        System.out.println("add cheese");
    }
}

class PizzaWithBeacon implements IPizza {

    private final IPizza pizza;

    PizzaWithBeacon(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void make() {
        pizza.make();

        System.out.println("add beacon");
    }
}
