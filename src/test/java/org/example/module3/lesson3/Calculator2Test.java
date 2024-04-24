package org.example.module3.lesson3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Calculator2Test {

    private final Calculator calculator = new Calculator();

    // FIRST

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @Nested
    class DivisionTest {

        @AfterEach
        void afterEach2() {
            System.out.println("after each 2");
        }

        @Test
        void divShouldThrowExceptionIfDivisorIsZero() {
            IllegalArgumentException illegalArgumentException =
                    assertThrows(IllegalArgumentException.class, () -> calculator.div(1, 0), "Message in assertion failed");

            assertEquals(illegalArgumentException.getMessage(), "Divisor is zero");
        }

        @BeforeEach
        void beforeEach2() {
            System.out.println("before each 2");
        }


    }

    @Nested
    class Add {

        @BeforeEach
        void beforeEach1() {
            System.out.println("before each 1");
        }


        @AfterEach
        void afterEach1() {
            System.out.println("after each 1");
        }

        @Test
        @DisplayName("Add 2 positive numbers")
        void addShouldReturnSumForPositiveNumber() {
            int actual = calculator.add(1, 1);
            int expected = 2;

            assertEquals(expected, actual, "Message in assertion failed");
        }


    }

    @Timeout(2)
    @Test
    @Disabled
    void testWithTimeout() throws InterruptedException {

        Thread.sleep(10_000);
    }


    @ParameterizedTest
    @MethodSource("addParams")
    void addShouldReturnSumForPositiveNumberParametrized(int a, int b, int expected) {
        int actual = calculator.add(a, b);

        assertEquals(expected, actual, "Message in assertion failed");
    }

    public static Stream<Arguments> addParams() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, 100, 99),
                Arguments.of(3, 2, 5)
        );
    }


    @Test
    void test2(){
        A actual = new A(1);
        A expected = new A(1);

        assertEqualsA(expected, actual);
        assertEquals(expected, actual);
    }

    private static void assertEqualsA(A expected, A actual) {
        assertEquals(expected.getValue(), actual.getValue());
        //
    }

    class A{
        private final int value;

        A(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a = (A) o;
            return value == a.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public String toString() {
            return "A{" +
                    "value=" + value +
                    '}';
        }
    }

}
