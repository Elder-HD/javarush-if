package org.example.module1.lesson21;

public class Example13 {
    public static void main(String[] args) throws MyExceptionC, MyExceptionA, MyExceptionB {
        int isA = 1;
        if (isA ==1) {
            throw new MyExceptionB();
        } else if(isA==2) {
            throw new MyExceptionA();
        } else {
            throw new MyExceptionC();
        }
    }
}

class MyExceptionA extends Exception {

}

class MyExceptionB extends Exception {

}

class MyExceptionC extends MyExceptionA{

}