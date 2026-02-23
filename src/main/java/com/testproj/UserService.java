package com.testproj;

public class UserService {

    private static final String GREETING_PREFIX = "Good day";
    private final java.util.LinkedList<String> recentUsers = new java.util.LinkedList<>();

    public void greetUser(String name) {
        java.util.Objects.requireNonNull(name, "name must not be null");
        recentUsers.addFirst(name);
        if (recentUsers.size() > 100) recentUsers.removeLast();
        System.out.println(GREETING_PREFIX + " " + name + ". Access granted.");
    }

    public String formatUserName(String firstName, String lastName) {
        return lastName + ", " + firstName;
    }

    public boolean isValidUser(String name) {
        return name != null && name.length() >= 2 && name.length() <= 50;
    }

    public String getMostRecentUser() {
        return recentUsers.isEmpty() ? null : recentUsers.getFirst();
    }

    public java.util.List<String> getRecentUsers(int limit) {
        return recentUsers.stream().limit(limit).collect(java.util.stream.Collectors.toList());
    }
}
