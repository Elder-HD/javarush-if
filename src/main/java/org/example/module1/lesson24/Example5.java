package org.example.module1.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example5 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader buff =
                        new BufferedReader(new InputStreamReader(System.in))) {
            String line = buff.readLine();
            System.out.println(line);
        }


    }
}
