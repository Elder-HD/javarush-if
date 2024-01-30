package org.example.module1.lesson27;

public class Example2 {
    public static void main(String[] args) {
        A originalA = new A();
        B b = new B(originalA);
        System.out.println(b);
        System.out.println("=============");
//        b.setA(new A());  // we cannot have setter in B class as field is final

        A a = b.getA();
        a.setValue(100);

        System.out.println(b);

        System.out.println("==============");

        originalA.setValue(1_000_000);
        System.out.println(b);


    }
}

class A {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}

class  B {
    private final A a;

    public B(A a) {
        if (a == null) {
            this.a = null;
        } else {
            A aCopy = new A();
            aCopy.setValue(a.getValue());
            this.a = aCopy;
        }
    }

    public A getA() {
        if (this.a == null) {
            return null;
        }
        A aCopy = new A();
        aCopy.setValue(a.getValue());

        return aCopy;
    }


    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                '}';
    }
}
