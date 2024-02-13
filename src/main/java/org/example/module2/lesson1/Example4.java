package org.example.module2.lesson1;

public class Example4 {

    public static void main(String[] args) {
        Movable[] items = new Movable[]{new MyDog(), new MyFish(), new MyFish()};

        for (Movable item : items) {
            item.move();
        }
    }
}

interface Movable {
   public  static final int value = 1;

    void move();
}

class MyDog implements Movable {


    @Override
    public void move() {
        System.out.println("running");
    }
}

class MyFish implements Movable {

    @Override
    public void move() {
        System.out.println("swimming");
    }
}
