package org.example.module3.lesson5.a;

import lombok.extern.log4j.Log4j;
import org.example.module3.lesson5.MyInterface;


@Log4j
public class A implements MyInterface {
//    private static final Logger LOGGER = Logger.getLogger(A.class);

    @Override
    public void method(String message) {
        log.debug("A-debug");
    }
}