package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Hello";
    private final java.util.Map<String, Long> userSessions = new java.util.HashMap<>();

    public void greetUser(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("User name is required");
        }
        userSessions.put(name, System.currentTimeMillis());
        System.out.println(GREETING_PREFIX + " " + name + ". Session started.");
    }

    public String formatUserName(String firstName, String lastName) {
        return String.format("%s %s", firstName.trim(), lastName.trim());
    }

    public boolean isValidUser(String name) {
        return name != null && name.chars().allMatch(Character::isLetter);
    }

    public void endSession(String name) {
        userSessions.remove(name);
        System.out.println("Session ended for " + name + ".");
    }

    public long getSessionStart(String name) {
        return userSessions.getOrDefault(name, -1L);
    }
}
