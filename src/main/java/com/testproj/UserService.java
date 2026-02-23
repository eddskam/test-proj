package com.testproj;

public class UserService {

    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public String formatUserName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public boolean isValidUser(String name) {
        return name != null && !name.isEmpty();
    }
}
