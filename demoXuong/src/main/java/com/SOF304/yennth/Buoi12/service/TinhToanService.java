package com.SOF304.yennth.Buoi12.service;

import java.util.ArrayList;
import java.util.List;

public class TinhToanService {

    public Double tongSoChan(Double numberFirst, Double numberSecond) {
        if (numberFirst % 2 != 0 && numberSecond % 2 != 0) {
            throw new IllegalArgumentException("Vui long nhap so chan de tinh tong");
        }
        return numberFirst + numberSecond;
    }

    public List<Integer> isSoNguyenAm(int[] numbers) {
        List<Integer> soNguyenAm = new ArrayList<>();
        for (int number : numbers) {
            if (number < 0) {
                soNguyenAm.add(number);
                System.out.println(number + " la so nguyen am");
            }
        }
        return soNguyenAm;
    }

}
