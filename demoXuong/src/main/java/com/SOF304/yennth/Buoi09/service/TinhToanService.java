package com.SOF304.yennth.Buoi09.service;

public class TinhToanService {

    public static Double tinhTrungBinhCong(Double toan , Double van , Double anh) {
        return ((toan + van) * 2 + anh) / 5.0;
    }

    public static int soNguyenDuongN(int n) {
        int sum = 0;
        if (n >= 0) {
            for (int i = 0; i < n + 1; i++) {
                if (i != 6 && i % 2 == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            throw new ArithmeticException("N phai la so duong");
        }
    }
}
