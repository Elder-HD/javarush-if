package org.example.module1.lesson24;

public class Example3 {
    public static void main(String[] args) {
//        Pizza emptyPizza = new EmptyPizza();
//        PizzaWithCheese pizzaWithCheese = new PizzaWithCheese(emptyPizza);
//        PizzaWithFish pizzaWithCheeseAndFish = new PizzaWithFish(pizzaWithCheese);
//        PizzaWithCheese pizzaWithCheeseAndFishAndCheese =
//                new PizzaWithCheese(pizzaWithCheeseAndFish);
//        pizzaWithCheeseAndFishAndCheese.cook();


       new PizzaWithCheese(new PizzaWithFish( new PizzaWithCheese(new EmptyPizza()))).cook();
    }
}

abstract class Pizza {
    public abstract void cook();
}

class EmptyPizza extends Pizza {

    @Override
    public void cook() {
        System.out.println("empty pizza cooking");
    }
}

class PizzaWithCheese extends Pizza {

    private final Pizza pizza;

    PizzaWithCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();
        System.out.println("add cheese");
    }
}

class PizzaWithFish extends Pizza {
    private final Pizza pizza;

    PizzaWithFish(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void cook() {
        pizza.cook();

        System.out.println("add fish");
    }
}

