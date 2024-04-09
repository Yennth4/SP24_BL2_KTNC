package com.SOF304.yennth.Buoi10.service;

public class TinhToanService {

    public static Double trungBinhCong(Double toan, Double ly, Double hoa) {
        if (toan < 0 || ly < 0 || hoa < 0 || toan > 10 || ly > 10 || hoa > 10) {
            throw new ArithmeticException("Diem khong hop le");
        }
        return (toan + ly + hoa) / 3.0;
    }

    public static Double tinhThuong(int numberFirst, int numberSecond) {
        if (numberSecond == 0) {
            throw new ArithmeticException("Khong chia duoc cho 0");
        }
        return Double.valueOf((numberFirst / numberSecond));
    }
}
