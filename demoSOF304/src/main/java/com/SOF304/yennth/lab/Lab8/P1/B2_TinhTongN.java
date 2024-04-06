package com.SOF304.yennth.lab.Lab8.P1;

public class B2_TinhTongN {

    public static int sumUpToN(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else {
            throw new IllegalArgumentException("N phải là số dương");
        }
    }
}
