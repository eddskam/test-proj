package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-Release";
    private static final int VERSION = 7;
    private static final String ENV = "production";
    private static final java.time.Instant BOOT_TIME = java.time.Instant.now();

    public static void main(String[] args) {
        System.out.println(APP_NAME + " v" + VERSION + " booted at " + BOOT_TIME);
        UserService userService = new UserService();
        userService.greetUser("System");
    }

    public static String getAppName() {
        return APP_NAME + ":" + VERSION;
    }

    public static int getVersion() {
        return VERSION;
    }

    public static String getEnvironment() {
        return ENV;
    }

    public static java.time.Instant getBootTime() {
        return BOOT_TIME;
    }
}
