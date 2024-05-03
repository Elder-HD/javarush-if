package org.example.module3.lesson5;

import org.apache.log4j.Logger;
import org.example.module3.lesson5.a.A;
import org.example.module3.lesson5.b.B;

public class Example2 {
    public static void main(String[] args) {
        new Service2().method("Hello");
        new A().method("a");
        new B().method("b");

    }
}

class Service2 {
    private static final Logger LOGGER = Logger.getLogger(Service2.class);

    public void method(String value) {
        LOGGER.debug("debug -example 2");
    }
}