package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Greetings";
    private final java.util.List<String> userLog = new java.util.ArrayList<>();

    public void greetUser(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Name must not be null or blank");
        }
        System.out.println(GREETING_PREFIX + ", " + name + ". You are now logged in.");
        userLog.add(name);
    }

    public String formatUserName(String firstName, String lastName) {
        return firstName.charAt(0) + ". " + lastName;
    }

    public boolean isValidUser(String name) {
        return name != null && name.matches("[a-zA-Z]{2,}");
    }

    public void removeUser(String name) {
        userLog.remove(name);
        System.out.println("User " + name + " removed from session.");
    }

    public java.util.List<String> getUserLog() {
        return java.util.Collections.unmodifiableList(userLog);
    }
}
