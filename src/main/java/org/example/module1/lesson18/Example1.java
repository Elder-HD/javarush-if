package org.example.module1.lesson18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        HashMap<String, String> loginToPassword = new HashMap<>();
        loginToPassword.put("login1", "password1");
        loginToPassword.put("login2", "password2");
        loginToPassword.put("login3", "password2");
        System.out.println(loginToPassword.get("login3"));
        loginToPassword.put("login3", "password100");
        System.out.println(loginToPassword.get("login3"));
        System.out.println(loginToPassword.get("blabla"));
        System.out.println(loginToPassword.size());

        System.out.println(loginToPassword.containsKey("login1"));
        System.out.println(loginToPassword.containsKey("blabla"));

        System.out.println(loginToPassword.containsValue("password2"));
        System.out.println(loginToPassword.containsValue("password200"));

        System.out.println(loginToPassword.remove("login"));
        System.out.println(loginToPassword.remove("login1"));

//        loginToPassword.clear();
//
//        System.out.println(loginToPassword.size());

        Set<String> passwords = loginToPassword.keySet();
        System.out.println(passwords);

        Collection<String> values = loginToPassword.values();
        System.out.println(values);
    }
}
