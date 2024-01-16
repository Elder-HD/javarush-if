package org.example.module1.lesson22;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable {

    public Resource(boolean emulateProblem) {
        if (emulateProblem) {
            throw new RuntimeException("problem with resource instance creation");
        }
    }

    public String getData(boolean emulateProblem) {
        System.out.println("open connection to resource");
        if (emulateProblem) {
            throw new RuntimeException("problem with getData method");
        }
        return "data";
    }

    @Override
    public void close() throws IOException {
        System.out.println("close resource");
    }
}
