package org.example.module2.lesson7.example2;

public class Example6 {
    public static void main(String[] args) {
        Object reference1 = "Blalba";
        String stringReference = (String)reference1;
        System.out.println(stringReference.length());


        String stringReference2 =".......";

        Object reference2 = stringReference2;

        int a = 1;

        byte b =1;

        a=b;
        b=(byte) a;

        // Boolean

        // a(int) --> boxing Integer;
        // reference type of Integer --> reference type of Object
        // suppose that in reference type of object we have object of Boolean class,
        // and try to extract(unboxing) boolean primitive

         boolean bl = (boolean) (Boolean) (Object)(Integer)a;
    }
}
