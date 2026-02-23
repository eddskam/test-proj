package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-LTS";
    private static final int VERSION = 8;
    private static final String ENV = "production";

    public static void main(String[] args) {
        System.out.println("[LTS] " + APP_NAME + " v" + VERSION + " ready");
        UserService userService = new UserService();
        userService.greetUser("Operator");
        System.out.println("Healthcheck: OK");
    }

    public static String getAppName() {
        return APP_NAME.toLowerCase();
    }

    public static int getVersion() {
        return VERSION;
    }

    public static String getEnvironment() {
        return ENV;
    }
}
