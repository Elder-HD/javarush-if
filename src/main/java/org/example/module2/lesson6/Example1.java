package org.example.module2.lesson6;

public class Example1 {

    public static void main(String[] args) {
        My1Class item = new My1Class();

        if( item instanceof My1Interface){     // My1Interface temp = (My1Interface) item;

        }
    }
}

interface My1Interface {

}

class My1Class implements My1Interface {

}