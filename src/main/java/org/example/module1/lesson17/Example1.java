package org.example.module1.lesson17;

public class Example1 {
    public static void main(String[] args) {

    }
}

interface Workable {
    public void work();
}

class WorkableImpl implements Workable{

    @Override
    public void work() {
        System.out.println("work");
    }
}
