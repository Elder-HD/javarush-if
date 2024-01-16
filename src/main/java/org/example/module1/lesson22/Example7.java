package org.example.module1.lesson22;

import java.io.IOException;

public class Example7 {
    public static void main(String[] args) {
        /*
            Resource resource = new Resource(true);
            String data = resource.getData(false);
            System.out.println(data);
            resource.close();
         */

        Resource resource = null;
        try {
            resource = new Resource(true);
            String data = resource.getData(false);
            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (resource != null) {
                try {
                    resource.close();
                } catch (IOException e) {
                    System.out.println("problem of resource close");
                    System.out.println(e);
                }
            }
        }
    }
}

