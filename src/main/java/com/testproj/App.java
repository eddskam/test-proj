package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-Feature";
    private static final int VERSION = 4;
    private static final boolean DEBUG = true;

    public static void main(String[] args) {
        if (DEBUG) {
            System.out.println("[DEBUG] Launching " + APP_NAME);
        }
        System.out.println("Welcome to " + APP_NAME + " v" + VERSION);
        UserService userService = new UserService();
        userService.greetUser("Bob");
        Calculator calc = new Calculator();
        System.out.println("Result: " + calc.add(5, 10));
    }

    public static String getAppName() {
        return APP_NAME + " (Feature Build)";
    }

    public static int getVersion() {
        return VERSION;
    }

    public static String getEnvironment() {
        return ENV;
    }
}
