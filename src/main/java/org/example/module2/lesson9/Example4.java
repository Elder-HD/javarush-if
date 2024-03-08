package org.example.module2.lesson9;

public class Example4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Integer> integerClass = Integer.class;
        Class<? extends Integer> aClass = new Integer(1).getClass();
        System.out.println(integerClass == aClass);

        Class<Integer> intClass = int.class;

        System.out.println(integerClass == intClass);

        System.out.println(intClass.getName()); // int

        Class<?> anInt = Class.forName("int");
        System.out.println(anInt.getName());
    }
}
