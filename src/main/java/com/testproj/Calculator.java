package com.testproj;

public class Calculator {

    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    public int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }

    public double squareRoot(double value) {
        if (value < 0) throw new ArithmeticException("Cannot sqrt negative");
        return Math.sqrt(value);
    }

    public int abs(int value) {
        return Math.abs(value);
    }
}
