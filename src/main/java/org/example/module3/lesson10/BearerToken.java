package org.example.module3.lesson10;

public class BearerToken implements QueryParameter{
    private final String token;

    public BearerToken(String token) {
        this.token = token;
    }

    @Override
    public String query() {
        return String.format("access-token=%s", token);
    }
}
