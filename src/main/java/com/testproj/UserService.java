package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Hi";
    private final java.util.Set<String> onlineUsers = new java.util.HashSet<>();

    public void greetUser(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        onlineUsers.add(name);
        System.out.println(GREETING_PREFIX + " " + name + "! You are online.");
    }

    public String formatUserName(String firstName, String lastName) {
        return (firstName + "." + lastName).toLowerCase();
    }

    public boolean isValidUser(String name) {
        return name != null && name.length() > 1 && !name.contains(" ");
    }

    public void logoutUser(String name) {
        onlineUsers.remove(name);
        System.out.println("User " + name + " logged out.");
    }

    public boolean isUserOnline(String name) {
        return onlineUsers.contains(name);
    }
}
