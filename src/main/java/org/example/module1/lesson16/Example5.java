package org.example.module1.lesson16;

import java.lang.String;
import java.lang.Character;

public class Example5 {
    public static void main(String[] args) {
        char digit = '9';
        char letter = 'A';
        char letter2 = 'Ю';
        char letter3 = 'Ї';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isLetter(letter2));
        System.out.println(Character.isLetter(letter3));
        System.out.println(Character.isLetter(digit));
        System.out.println(Character.isDigit(digit));

        System.out.println(Character.isSpaceChar(' '));

        System.out.println("========================");
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('1'));
    }
}
