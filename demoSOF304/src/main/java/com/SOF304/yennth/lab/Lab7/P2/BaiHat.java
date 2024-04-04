package com.SOF304.yennth.lab.Lab7.P2;

public class BaiHat {
    private String id;
    private String ten;
    private String tenCaSi;
    private int doDai;
    private String tenNhacSi;

    public BaiHat() {
    }

    public BaiHat(String id, String ten, String tenCaSi, int doDai, String tenNhacSi) {
        this.id = id;
        this.ten = ten;
        this.tenCaSi = tenCaSi;
        this.doDai = doDai;
        this.tenNhacSi = tenNhacSi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public String getTenNhacSi() {
        return tenNhacSi;
    }

    public void setTenNhacSi(String tenNhacSi) {
        this.tenNhacSi = tenNhacSi;
    }
}
