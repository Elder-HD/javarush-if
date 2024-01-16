package org.example.module1.lesson22;

public class Example1 {
    public static void main(String[] args) throws MyException {
        boolean a = true;
        boolean b = true;

        if (a) {
            throw new MyRuntimeException("some message");
        }

        if (b) {
            throw new MyException();
        }
        System.out.println("End");
    }


    public void method1(Object object) {
        try {
            methodWeCannotChange(object);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private static void methodWeCannotChange(Object object) throws Exception {
        if (object == null) {
            throw new Exception();
        }
    }
}

// custom unchecked exception
class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
        super();
    }

    public MyRuntimeException(String message) {
        super(message);
    }


    public MyRuntimeException(Throwable cause) {
        super(cause);
    }

    public MyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// custom checked exception

class MyException extends Exception {

}
