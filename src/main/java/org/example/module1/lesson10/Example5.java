package org.example.module1.lesson10;

public class Example5 {
    public int count = 0;
    public int sum = 0;
    public void add(int data) {
        System.out.println(sum);
        int sum = data * 2;
        System.out.println(sum);
        System.out.println(this.sum);
        this.sum = this.sum + data;
        count++;
    }
}
