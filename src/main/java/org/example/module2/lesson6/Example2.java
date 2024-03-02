package org.example.module2.lesson6;

public class Example2 {
    public static void main(String[] args) {
        // option 1 create simple class My2Class
        My2Interface item = new My2Class();

        System.out.println(item.say());

        item.print("Hi all!");

        // anonymous class
        My2Interface item2 = new My2Interface() {
            private final int value =1;
            @Override
            public String say() {
                System.out.println(value);
                return "anonymous: hello";
            }

            @Override
            public void print(String message) {
                System.out.println("************");
                System.out.println(message);
                System.out.println("************");
            }


            public void m(){

            }
        };

        System.out.println(item2.say());

        System.out.println(item2.getClass().getName());


        Object o = new Object() {

        };

        System.out.println(o.getClass().getName());

    }
}

interface My2Interface {
    String say();

    void print(String message);
}

class My2Class implements My2Interface {

    @Override
    public String say() {
        return "Hello";
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}


class Creater{
    My2Interface create(){
        return new My2Interface() {
            @Override
            public String say() {
                return null;
            }

            @Override
            public void print(String message) {

            }
        };
    }
}