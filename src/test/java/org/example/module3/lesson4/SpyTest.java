package org.example.module3.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SpyTest {

    @Spy
    private A a = new A();

    @Test
    void spyTest1() {
        Mockito.when(a.method(1)).thenReturn(2);
        int result = a.method(1);

        Assertions.assertEquals(2, result);
        Mockito.verify(a).method(1);
    }

    @Test
    void spyTest11() {
//        Mockito.when(a.method(1)).thenReturn(2);
        Mockito.doReturn(2).when(a).method(1);
        int result = a.method(1);

        Assertions.assertEquals(2, result);
        Mockito.verify(a).method(1);
    }

    @Test
    void spyTest2() {
        Mockito.when(a.method(0)).thenReturn(2);
        int result = a.method(0);

        Assertions.assertEquals(2, result);
        Mockito.verify(a).method(2);
    }
}

class A {

    public int method(int value) {
        System.out.println("invoke method with value: " + value);
        if (value == 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}
