package com.SOF304.yennth.asm.service;

public class TinhToanService {

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static int tinhTich(int a, int b) {
        return a * b;
    }

    public static int tinhHieu(int a, int b) {
        return a - b;
    }

    public static double trungBinhCong(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static int truyXuat1PhanTu(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid array or index");
        }
        return arr[index];
    }

}
