package org.example.module1.lesson21;

public class Example7 {
    public static void main(String[] args) {
        int choose = 1;
        try {
            if (choose == 1) {
                throw new AException();
            } else if (choose == 2) {
                throw new BException();
            } else {
                throw new CException();
            }
        } catch (CException e) {
            System.out.println(e);
        } catch (AException e) {
            System.out.println(e);
        } catch (BException e) {
            System.out.println(e);
        }

    }
}

class AException extends Exception {

}

class BException extends Exception {

}

class CException extends AException {

}
