package com.SOF304.yennth.asm.entity;

public class SinhVien {
    private String id;
    private String hoten;
    private String maLop;
    private String tenlop;
    private String masv;

    public SinhVien(String id, String hoten, String maLop, String tenlop, String masv) {
        this.id = id;
        this.hoten = hoten;
        this.maLop = maLop;
        setTenlop(tenlop);
        this.masv = masv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        // Kiểm tra tenlop không chứa ký tự đặc biệt
        if (tenlop.matches("[a-zA-Z0-9 ]+")) {
            this.tenlop = tenlop;
        } else {
            throw new IllegalArgumentException("Tên lớp không được chứa ký tự đặc biệt");
        }
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}

