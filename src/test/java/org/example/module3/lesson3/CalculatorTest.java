package org.example.module3.lesson3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    // FIRST

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach1(){
        System.out.println("before each 1");
    }


    @BeforeEach
    void beforeEach2(){
        System.out.println("before each 2");
    }


    @AfterEach
    void afterEach1(){
        System.out.println("after each 1");
    }

    @AfterEach
    void afterEach2(){
        System.out.println("after each 2");
    }
    @Test
//    @Disabled
    @DisplayName("Add 2 positive numbers")
    void addShouldReturnSumForPositiveNumber() {
        int actual = calculator.add(1, 1);
        int expected = 2;

        assertEquals(expected, actual, "Message in assertion failed");
    }

    @Test
    void divShouldThrowExceptionIfDivisorIsZero() {
        IllegalArgumentException illegalArgumentException =
                assertThrows(IllegalArgumentException.class, () -> calculator.div(1, 0),"Message in assertion failed");

        assertEquals(illegalArgumentException.getMessage(), "Divisor is zero");
    }

}