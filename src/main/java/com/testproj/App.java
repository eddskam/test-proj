package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-Production";
    private static final int VERSION = 5;
    private static final String ENV = "production";

    public static void main(String[] args) {
        System.out.println("[" + ENV + "] " + APP_NAME + " v" + VERSION + " starting...");
        UserService userService = new UserService();
        userService.greetUser("Admin");
    }

    public static String getAppName() {
        return APP_NAME + " (" + ENV + ")";
    }

    public static int getVersion() {
        return VERSION;
    }

    public static String getEnvironment() {
        return ENV;
    }
}
