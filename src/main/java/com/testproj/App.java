package com.testproj;

public class App {

    private static final String APP_NAME = "TestApp-Main";
    private static final int VERSION = 3;

    public static void main(String[] args) {
        System.out.println("Starting " + APP_NAME + " v" + VERSION);
        UserService userService = new UserService();
        userService.greetUser("Charlie");
    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static int getVersion() {
        return VERSION;
    }
}
