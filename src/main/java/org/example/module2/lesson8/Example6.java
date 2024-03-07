package org.example.module2.lesson8;

public class Example6 {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.a);//1
        System.out.println(c.b);//6
        System.out.println(c.c);//30
    }
}

//int ---> Integer ?
class C {
    public int a = 5;
    public int b = a + 1;//6
    public int c = a * b;//5*6=30

    {
        this.a = 100;
    }

    public C() {
        super();
        //non-static block
        this.a = 1;
    }
}
