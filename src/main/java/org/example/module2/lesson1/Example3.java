package org.example.module2.lesson1;

import java.time.LocalDate;

////bad example
public class Example3 {
    public static void main(String[] args) {

    }
}

class Animal extends EntityObject {
//    String name;
//    LocalDate birth;

    //....
}


class Client extends EntityObject {
    //    String name;
    String surname;

//    LocalDate birth;

    String password;

    //....
}

class EntityObject {
    String name;

    LocalDate birth;
}

