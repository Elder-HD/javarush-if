package org.example.module1.lesson22;

//VERY bad example. don't extract instance of exception into constants/fields or variable
public class Example4 {

    public static final Exception EXCEPTION = new Exception();

    public static void main(String[] args) throws Exception {
        System.out.println("start");
        boolean toThrow = true;

        if (toThrow) {
            throw EXCEPTION;
        }
    }
}
