package com.yennth.PH31906_13042024_Final;

public class TinhToanService {

    public boolean kiemTraSoNhap(int a) {
        if (((a * a) % 2 == 0)) {
            throw new IllegalArgumentException(a + " khong phai so le");
        }
        if (((a * a) % 5 != 0)) {
            throw new IllegalArgumentException(a + " khong chia het cho 5");
        }
        return true;
    }

    public int soNguyenBeNhat(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        } else if (c == min && b == min) {
            min = c;
        }

        System.out.println(min + " là số bé nhất");
        return min;
    }
}
