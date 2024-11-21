package org.example;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero");
        }
        return a / b;
    }
}
