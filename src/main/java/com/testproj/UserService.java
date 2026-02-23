package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Hey there";
    private int activeUsers = 0;

    public void greetUser(String name) {
        System.out.println(GREETING_PREFIX + ", " + name + "! Welcome aboard.");
        activeUsers++;
    }

    public String formatUserName(String firstName, String lastName) {
        return lastName.toLowerCase() + "." + firstName.toLowerCase();
    }

    public boolean isValidUser(String name) {
        return name != null && name.length() >= 3;
    }

    public void deactivateUser(String name) {
        System.out.println("User " + name + " has been deactivated.");
        activeUsers--;
    }

    public int getActiveUserCount() {
        return activeUsers;
    }
}
