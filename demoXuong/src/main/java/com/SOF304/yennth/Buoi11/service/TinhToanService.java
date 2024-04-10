package com.SOF304.yennth.Buoi11.service;

public class TinhToanService {

    public boolean checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " là một số nguyên dương.");
            return true;
        } else if (num == 0) {
            System.out.println(num + " là số không.");
            return true;
        } else {
            System.out.println(num + " là một số nguyên âm.");
            return false;
        }
    }

    public boolean checkDiemTB(float diemTB) {
        if (diemTB < 0 || diemTB > 10) {
            throw new IllegalArgumentException(diemTB + " la diem khong hop le");
        } else {
            if (diemTB < 5) {
                System.out.println(diemTB + " SV yeu");
                return true;
            } else if (diemTB < 7) {
                System.out.println(diemTB + " SV TB kha");
                return true;
            } else if (diemTB < 8) {
                System.out.println(diemTB + " SV kha");
                return true;
            } else if (diemTB < 9) {
                System.out.println(diemTB + " SV gioi");
                return true;
            } else {
                System.out.println(diemTB + " SV xuat sac");
                return true;
            }
        }
    }
}
