package com.SOF304.yennth.lab.Lab7.P1;

public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không chia được cho 0");
        }
        return a / b;
    }
}
