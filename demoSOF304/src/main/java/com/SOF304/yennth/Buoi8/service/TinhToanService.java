package com.SOF304.yennth.Buoi8.service;

public class TinhToanService {

    public static int tinhHieu(int a ,int b) {
        return a - b;
    }

    public static int tinhChia(int a ,int b) {
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Không được chia cho 0");
        }
    }

    public String xepLoaiDiem(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Điểm số không hợp lệ.");
        } else if (score >= 0 && score <= 40) {
            return "F";
        } else if (score <= 70) {
            return "B";
        } else {
            return "A";
        }
    }

    public double tinhTrungBinhCong(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public int tinhTongTu1DenN(int n) {
        return n * (n + 1) / 2;
    }

}
