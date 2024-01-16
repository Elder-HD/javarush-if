package org.example.module1.lesson22;

public class Example2 {
    public static void main(String[] args) {
        throw new ARuntimeException(1014);
    }
}

class ARuntimeException extends RuntimeException {
    private final int code;

    ARuntimeException(int code) {
        this.code = code;
    }

    public ARuntimeException(String message, int code) {
        super(message);
        this.code = code;
    }

    public ARuntimeException(Throwable cause, int code) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
