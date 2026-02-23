package com.testproj;

public class Calculator {

    public java.math.BigDecimal add(java.math.BigDecimal a, java.math.BigDecimal b) {
        return a.add(b);
    }

    public java.math.BigDecimal subtract(java.math.BigDecimal a, java.math.BigDecimal b) {
        return a.subtract(b);
    }

    public java.math.BigDecimal multiply(java.math.BigDecimal a, java.math.BigDecimal b) {
        return a.multiply(b);
    }

    public java.math.BigDecimal divide(java.math.BigDecimal a, java.math.BigDecimal b) {
        if (b.compareTo(java.math.BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.divide(b, 10, java.math.RoundingMode.HALF_UP);
    }

    public double ceil(double value) {
        return Math.ceil(value);
    }

    public double floor(double value) {
        return Math.floor(value);
    }
}
