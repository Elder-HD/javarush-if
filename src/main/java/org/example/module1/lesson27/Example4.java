package org.example.module1.lesson27;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example4 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/MM/dd G 'at' HH:mm:ss z");
        Date current = new Date();

        System.out.println(current.toString());
        System.out.println(simpleDateFormat.format(current));
    }
}
