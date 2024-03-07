package org.example.module2.lesson8;

public class Example7 {
    //default cache low=-128 high=127
    //-XX:AutoBoxCacheMax we can change cache size
    public static void main(String[] args) {
        Integer a = 21;// int 1000 --> Integer.valueOf(1000)
        Integer b = 21;

        System.out.println(a == b);
        System.out.println(a.equals(b));
        Integer.valueOf(1000);
    }
}
