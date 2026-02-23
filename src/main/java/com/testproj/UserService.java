package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Welcome";

    public void greetUser(String name) {
        if (!isValidUser(name)) {
            throw new IllegalArgumentException("Invalid user name");
        }
        System.out.println(GREETING_PREFIX + " " + name + "! Glad to have you.");
    }

    public String formatUserName(String firstName, String lastName) {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public boolean isValidUser(String name) {
        return name != null && name.trim().length() > 0;
    }

    public void deleteUser(String name) {
        System.out.println("User " + name + " has been deleted permanently.");
    }
}
