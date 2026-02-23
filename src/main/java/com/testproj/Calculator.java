package com.testproj;

public class Calculator {

    public long add(long a, long b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public double divide(long a, long b) {
        if (b == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        return (double) a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input");
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }
}
