package org.example.module2.lesson7.example2;

public class Example3 {
    public static void main(String[] args) {
        // put only string into container

        MyContainer myContainer = new MyContainer();

        Object reference1 = 1;
        Object reference2 = "";

        // line 13 and 14 java version <14
        if(reference1 instanceof String){
            String stringValue1 = (String) reference1;
            myContainer.value1 = stringValue1;
        }

        if(reference2 instanceof String stringValue2){ // java version 14+
            myContainer.value2 = stringValue2;
        }
    }
}

class MyContainer{
    public String value1;
    public String value2;
}
