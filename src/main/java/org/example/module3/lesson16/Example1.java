package org.example.module3.lesson16;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        MFD mfd = new CanonMFD();
        System.out.println(mfd.print());
        System.out.println(mfd.scan());

        Printer printer = new CanonPrinter();

        List<Printer> list = Arrays.asList(mfd, printer);

        list .forEach(Printer::print);
    }
}

interface MFD extends Printer, Scanner {
}

interface Printer{
    String print();
}

interface Scanner {
    String scan();
}

class CanonMFD implements MFD{

    @Override
    public String print() {
        return "Canon - MFD -----> print";
    }

    @Override
    public String scan() {
        return "Canon - MFD -----> scan";
    }
}

class CanonPrinter implements Printer{

    @Override
    public String print() {
        return null;
    }

}
