package com.SOF304.yennth.lab.Lab8.P1;

public class B3_StringManipulator {

    public String concatenate(String str1, String str2) {
        if (str1 == null || str2 == null ) {
            throw new NullPointerException("Không được null");
        } if (str1.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Khong duoc de trong");
        }
        return str1 + str2;
    }
}
