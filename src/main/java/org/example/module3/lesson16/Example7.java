package org.example.module3.lesson16;

public class Example7 {
    public static void main(String[] args) {
        User user = User.build()
                .withName("Alex")
                .withSurname("Shevchenko")
                .build();
    }
}
class User{
    private final String name;
    private final String surname;

    public User(Builder builder) {
        // we can add some validation here
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static Builder build(){
        return new Builder();
    }

    public static class Builder{
        private  String name;
        private  String surname;

        private Builder(){}

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }


        public User build(){
            return new User(this);
        }
    }
}