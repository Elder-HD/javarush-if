package org.example.module3.lesson4;

import java.util.Objects;

public class SimpleEncoder implements PasswordEncoder{
    @Override
    public String encode(String rawPassword) {
        return rawPassword;
    }

    @Override
    public boolean match(String rawPassword, String encodedPassword) {
        return Objects.equals(rawPassword, encodedPassword);
    }
}
