package com.testproj;

public class Calculator {

    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (Float.compare(b, 0.0f) == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double log(double value) {
        if (value <= 0) throw new ArithmeticException("Log of non-positive");
        return Math.log(value);
    }

    public float negate(float value) {
        return -value;
    }
}
