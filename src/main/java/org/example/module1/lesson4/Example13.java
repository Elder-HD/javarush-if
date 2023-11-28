package org.example.module1.lesson4;

public class Example13 {
    public static void main(String[] args) {
        int age = 100;
        String ms = (age > 20) ? "age>20" : ((age > 10) ? "10>age<=20" : "age<=10");
        System.out.println(ms);
    }
}
