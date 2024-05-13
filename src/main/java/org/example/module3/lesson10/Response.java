package org.example.module3.lesson10;

import lombok.Builder;
import lombok.Data;

@Data
public class Response<T> {
    private final T body;

    private final int statusCode;
    //TODO:
    private String message;

    public Response(T body, int statusCode, String message) {
        this.body = body;
        this.statusCode = statusCode;
        this.message = message;
    }

    @Override
    public String toString() {
        return "status code: " + statusCode + '\n' +
                (body != null ? "body: " + body : "message: " + message);
    }
}
