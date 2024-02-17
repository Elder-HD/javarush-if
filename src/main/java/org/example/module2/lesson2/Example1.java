package org.example.module2.lesson2;

public class Example1 {
    public static void main(String[] args) {
//        Figure figure = new Figure();  // we cannot instantiate abstract class

//        Figure circle = new Circle(1);
        Circle circle = new Circle(1);
        Figure square = new Square(1);
//        Square square = new Square(1);
        System.out.println("circle perimeter: " + circle.getPerimeter());
        System.out.println("square perimeter:" + square.getPerimeter());

        Figure[] figures = new Figure[]{circle, square};
        System.out.println(figures[0].getPerimeter());
        System.out.println(figures[0].getName());


        double length = 0;
        for (Figure figure : figures) {
            length += figure.getPerimeter();
        }

        System.out.println(length);
    }

}

 abstract class Figure {
    private final String name;

    public Figure(String name) {
        this.name = name;
    }
//
//    public Figure() {
//        name="";
//    }

    public String getName() {
        return name;
    }

    public abstract double getPerimeter();
}

class Circle extends Figure {

    private final double radius;

    public Circle(double radius) {
        super("circle");
//         super();
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}

class Square extends Figure {

    private final double size;

    public Square(double size) {
        super("square");
        this.size = size;
    }

    @Override
    public double getPerimeter() {
        return 4 * size;
    }
}
