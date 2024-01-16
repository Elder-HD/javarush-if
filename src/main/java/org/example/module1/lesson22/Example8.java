package org.example.module1.lesson22;

import java.io.IOException;

public class Example8 {

    // try-with-resources
    public static void main(String[] args) {

        try(Resource resource = new Resource(true)) {
            String data = resource.getData(false);
            System.out.println(data);
        } catch (IOException e) {
            System.out.println("problem of resource close");
            System.out.println(e);
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
