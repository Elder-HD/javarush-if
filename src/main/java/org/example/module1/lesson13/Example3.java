package org.example.module1.lesson13;

public class Example3 {

    public static void main(String[] args) {
        Payment payment = new Payment(200);
        System.out.println(payment.totalPrice);
        System.out.println(payment.price);
        System.out.println(payment.tax);
    }
}


class Payment {
    public Payment(int price){
        this.price = price;
    }

    int price = 100;
    double tax = 0.2;
    double totalPrice = price * (1 + tax);

}
