package org.example.module3.lesson18;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Example5 {
    public static void main(String[] args) {

        SoftReference<User> userSoftReference = new SoftReference<>(new User());
        System.out.println(userSoftReference.get());

        WeakReference<User> userWeakReference = new WeakReference<>(new User());

        System.out.println(userWeakReference.get());

        PhantomReference<User> userPhantomReference = new PhantomReference<>(new User(), null);
    }
}

class User {

    @Override
    public String toString() {
        return "User{}";
    }
}
