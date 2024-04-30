package org.example.module3.lesson3;

import lombok.Data;
import lombok.Getter;


class Calculator {

    public int add (int a, int b) {
        return getAnInt(a, b);
    }

    private int getAnInt(int a, int b) {
        return a + b;
    }


    public int div(int division, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor is zero");
        }
        return division/divisor;
    }
}
