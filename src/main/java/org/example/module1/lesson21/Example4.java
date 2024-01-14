package org.example.module1.lesson21;

//StackOverFlowError
public class Example4 {
    public static void main(String[] args) {
        factorial(100);
    }


    // not right implementation
    public static long factorial(int n) {
        return factorial(n - 1) * n;
    }
}
