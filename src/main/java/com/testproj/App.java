package com.testproj;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        UserService userService = new UserService();
        userService.greetUser("Alice");
    }

    public static String getAppName() {
        return "TestApp";
    }

    public static int getVersion() {
        return 1;
    }
}
