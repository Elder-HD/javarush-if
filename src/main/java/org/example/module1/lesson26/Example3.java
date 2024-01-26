package org.example.module1.lesson26;

// Task1*:
//https://en.wikipedia.org/wiki/Fibonacci_sequence
// 0, 1
//a_n=a_n_-1+a_n_-2
// - loop
// - recursion
public class Example3 {
    public static void main(String[] args) {
        System.out.println(factorial1(8));
        System.out.println(factorial2(8));
    }

    // 0!=1
    // 1!=1
    // n>0 n! = 1*2*3*...*(n-1)*n
    // 5!=1*2*3*4*5=120
    public static long factorial1(int n) {
        long result = 1;

        //1*1*2*3*
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    //0!=1

    //(n-1)!=1*2*3*...*(n-1)
    // n!= 1*2*3*...*(n-1)*n=(n-1)!*n = (n-2)!*(n-1)*n
    //n!=(n-1)!*n
    // return factorial2(n-1) *n;
    public static long factorial2(int n) {
        return (n == 0) ? 1 : factorial2(n - 1) * n;
    }
}
