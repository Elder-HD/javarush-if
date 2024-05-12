package org.example.module3.lesson10;

import lombok.Builder;
import lombok.Data;

@Data
public class Response<T> {
    private final T body;

    private final int statusCode;
    //TODO:
   // private String message;

    public Response(T body, int statusCode) {
        this.body = body;
        this.statusCode = statusCode;
    }
}
