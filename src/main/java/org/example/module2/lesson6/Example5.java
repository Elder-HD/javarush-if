package org.example.module2.lesson6;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        // <, >, <=, >=
        // item1 = new MyObject();  item2 = new MyObject(); item1 < item2

        UserMaxFinder2 userMaxFinder2 = new UserMaxFinder2();
        List<User> users = Arrays.asList(new User(), new User());
        MyComporator<User> userMyComporator = (f, s) -> f.age - s.age;

        User max = userMaxFinder2.max(users, userMyComporator);
    }

}

interface MaxFinder<T> {
    T max(List<T> items);
}

interface MaxFinder2<T> {
    T max(List<T> items, MyComporator<T> comporator);
}

interface MyComporator<T> {

    // 1) first > second  -> return value >0
    // 2) first < second  -> return value <0
    // 3) first = second  -> return 0
    int compare(T first, T second);
}

class InegerMaxFinder2 implements MaxFinder2<Integer> {

    @Override
    public Integer max(List<Integer> items, MyComporator<Integer> comporator) {
        int max = items.get(0);
        for (Integer item : items) {
            //   max = (item > max) ? item : max;
            max = (comporator.compare(item, max) > 0) ? item : max;
        }

        return max;
    }
}

class IntegerMaxFinder implements MaxFinder<Integer> {

    @Override
    public Integer max(List<Integer> items) {
        int max = items.get(0);
        for (Integer item : items) {
            max = (item > max) ? item : max;
        }

        return max;
    }
}

class User {

    public int age;

    public String name;
}

class UserMaxFinder implements MaxFinder<User> {
    @Override
    public User max(List<User> items) {
        User max = items.get(0);
        for (User item : items) {
            max = (item.age > max.age) ? item : max;
        }

        return max;
    }
}

class UserMaxFinder2 implements MaxFinder2<User> {

    @Override
    public User max(List<User> items, MyComporator<User> comporator) {
        User max = items.get(0);
        for (User item : items) {
            max = (comporator.compare(item, max) > 0) ? item : max;
        }

        return max;
    }
}
