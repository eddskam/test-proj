package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-Stable";
    private static final int VERSION = 6;
    private static final String ENV = "staging";

    public static void main(String[] args) {
        System.out.println("=== " + APP_NAME + " v" + VERSION + " [" + ENV + "] ===");
        UserService userService = new UserService();
        userService.greetUser("DevOps");
        System.out.println("App initialized successfully.");
    }

    public static String getAppName() {
        return APP_NAME + "-" + ENV;
    }

    public static int getVersion() {
        return VERSION;
    }

    public static String getEnvironment() {
        return ENV;
    }
}
