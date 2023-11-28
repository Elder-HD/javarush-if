package org.example.module1.lesson4;

public class Example3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        boolean result = (a || b) && (c ^ a);
        //(a || b) && (c ^ a) ---> (true || true) && (false ^ true)
        // true|| true --> true; ----->true && (false ^ true)
        //(false ^ true) ---> true
        //true && (false ^ true) ----> true && true ---> true

        System.out.println(result);
    }
}
