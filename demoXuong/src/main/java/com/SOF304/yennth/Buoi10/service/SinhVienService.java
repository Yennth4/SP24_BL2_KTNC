package com.SOF304.yennth.Buoi10.service;

import com.SOF304.yennth.Buoi10.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> listSinhVien;

    public SinhVienService() {
        listSinhVien = new ArrayList<>();

        listSinhVien.add(new SinhVien("SV1", "Nguyen Hai Yen", 24, 10f, 5, "PTPM"));
        listSinhVien.add(new SinhVien("SV2", "Nguyen Hai Yen 1", 25, 8f, 5, "UDPM"));
        listSinhVien.add(new SinhVien("SV3", "Nguyen Hai Yen 2", 26, 9f, 5, "XLDL"));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    public boolean checkMaSV(String maSV) {
        for (SinhVien sinhVien1 : listSinhVien) {
            if (sinhVien1.getMaSV().equalsIgnoreCase(maSV)) {
                throw new IllegalArgumentException("Mã sinh viên là duy nhất");
            }
        }
        return true;
    }

    public boolean checkTuoi(int tuoi) {
        if (tuoi <= 17 || tuoi > 100) {
            throw new IllegalArgumentException("Tuổi phải là số nguyên dương và lớn hơn 17");
        }
        return true;
    }

    public boolean checkChuyenNganh(SinhVien sinhVien) {
        if (!sinhVien.getChuyenNganh().equalsIgnoreCase("XLDL")
                && !sinhVien.getChuyenNganh().equalsIgnoreCase("PTPM")
                && !sinhVien.getChuyenNganh().equalsIgnoreCase("UDPM")
        ) {
            throw new IllegalArgumentException("Chuyen nganh khong hop le");
        } else {
            return true;
        }
    }

    public void themSinhVien(SinhVien sinhVien) {
        if (checkMaSV(sinhVien.getMaSV()) && checkTuoi(sinhVien.getTuoi()) && checkChuyenNganh(sinhVien)) {
            listSinhVien.add(sinhVien);
            System.out.println("Them thanh cong id: " + sinhVien.getMaSV());
        }
    }

    public void suaSinhVien(SinhVien sinhVien) {
        for(int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMaSV().equalsIgnoreCase(sinhVien.getMaSV())){
                listSinhVien.set(i , sinhVien);
            }
        }
    }

    public void xoaSinhVien(String maSV){
        for (int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMaSV().equalsIgnoreCase(maSV)) {
                listSinhVien.remove(i);
            }
        }
    }

}
