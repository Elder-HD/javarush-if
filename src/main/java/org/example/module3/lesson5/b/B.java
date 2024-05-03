package org.example.module3.lesson5.b;

import org.apache.log4j.Logger;
import org.example.module3.lesson5.MyInterface;
import org.example.module3.lesson5.User;

public class B implements MyInterface {

    private static final Logger LOGGER = Logger.getLogger(B.class);

    @Override
    public void method(String message) {
        LOGGER.info("B -info");
        User user = new User("id_001", "example@gmail.com");

        LOGGER.info(user);

        try {
            someMethod(message);
        } catch (Exception exception) {
            LOGGER.error("*********", exception);
        }
    }

    private void someMethod(String message) {
        someMethod2(message);
    }

    private void someMethod2(String message) {
        throw new RuntimeException();
    }
}