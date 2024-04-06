package com.SOF304.yennth.lab.Lab8.P1;

public class B1_TrungBinhCong {

    public double averageScore(int mathScore, int physicsScore, int chemistryScore) {
        if (mathScore < 0 || physicsScore < 0 || chemistryScore < 0) {
            throw new IllegalArgumentException("Điểm không được âm");
        }
        if (mathScore >= 10 || physicsScore >= 10 || chemistryScore >= 10) {
            throw new IllegalArgumentException("Điểm không được quá 10");
        }
        double diemTBC = mathScore + physicsScore + chemistryScore;
        return diemTBC / 3;
    }
}
