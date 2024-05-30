package org.example.module3.lesson17;

public class Example4 {
}

class Figure {
    //..

    public String accept(Visitor visitor){
        return visitor.method1(this);
    }

}
interface Visitor{
    String method1(Figure figure);

    String method2(Figure figure);
}



class AVisitor implements Visitor{

    @Override
    public String method1(Figure figure) {
        return "method1-A";
    }

    @Override
    public String method2( Figure figure) {
        return "method2-B";
    }
}
