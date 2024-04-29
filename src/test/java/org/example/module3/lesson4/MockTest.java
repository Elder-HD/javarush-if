package org.example.module3.lesson4;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockTest {

    @Test
    void test() {
        B mock = Mockito.mock(B.class);

        Mockito.when(mock.getValue())
                .thenReturn(1)
                .thenReturn(2);

        System.out.println(mock.getValue());
        System.out.println(mock.getValue());
        System.out.println(mock.getValue());
    }
}

interface B {
    int getValue();
}
