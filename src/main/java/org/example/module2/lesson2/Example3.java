package org.example.module2.lesson2;

public class Example3 {
    public static void main(String[] args) {

    }
}

abstract class AbstractClass {
   public abstract Object method(Object obj, String value) throws Exception;
}

class NotAbstractClass extends AbstractClass {

    // private --->
    // default ---> default, protected, public
    // protected ---> protected, public
    // public ---> public
    @Override
    public String method(Object blablal, String v)   {
        return null;
    }
}
