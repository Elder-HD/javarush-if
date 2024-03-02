package org.example.module2.lesson6;

public class Example4 {
    public static void main(String[] args) {
        My4Interface my4Interface1 = (times, message) -> System.out.println("....");
        My4Interface my4Interface2 = (times, message) -> {
            System.out.println("....");
            boolean b = true;
            if(b){
                throw new Exception();
            }
            System.out.println(".....");
        };
    }
}


@FunctionalInterface
interface My4Interface {
    void method(int v, String blabla) throws Exception;
}

