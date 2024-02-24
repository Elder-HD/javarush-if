package org.example.module2.lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        MyGenericClass myGenericClass = new MyGenericClass();
        List<Pet> list = Arrays.asList(new Pet(), new Pet(), new Pet());
        myGenericClass.print(list);

        ArrayList<C> list1 = new ArrayList<>();
        ArrayList<B> list2 = new ArrayList<>();
        ArrayList<A> list3 = new ArrayList<>();
        myGenericClass.method(list3);
    }


}

class MyGenericClass {
    public void print(List<? extends Pet> list) {
        for (Pet item : list) {
            item.incrementCounter();
        }
    }


    public void addItem(List<? extends Pet> list){ // pets, cats, dogs
//        list.add(new Pet());  // does not compile
    }

    public void method(List<? super B> list){

    }

}

class Pet {

    private static int counter=0;

    public void incrementCounter(){
        counter++;
        System.out.println(counter);
    }
}

class Cat extends Pet {
}

class Dog extends Pet{

}

class A{}
class B extends A{}
class C extends B{

}