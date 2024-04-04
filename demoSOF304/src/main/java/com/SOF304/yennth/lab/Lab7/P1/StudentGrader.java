package com.SOF304.yennth.lab.Lab7.P1;

public class StudentGrader {

    private int score;

    public StudentGrader(int score) {
        this.score = score;
    }

    public String calculateGrade() {
        if (score >= 0 && score <= 40) {
            return "F";
        } else if (score > 40 && score <= 60) {
            return "D";
        } else if (score <= 70 && score > 60) {
            return "C";
        } else if (score > 70 && score <= 80) {
            return "B";
        } else if (score <= 100 && score > 80) {
            return "A";
        }
        else {
            throw new IllegalArgumentException("Điểm số không hợp lệ");
        }
    }
}
