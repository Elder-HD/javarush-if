package org.example.module1.lesson21;

// checked exception
public class Example10 {
    public static void main(String[] args)  {
        Object object = null;
        try {
            validateOnNull(object);
        } catch (Exception e) {
            System.out.println("==============");
            System.out.println(e);
            System.out.println("==============");
        }
    }


    private static void validateOnNull(Object object) throws Exception {
        if (object == null) {
            throw new Exception();// this is checked exception
        }
    }
}
