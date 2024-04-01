package com.SOF304.yennth.asm.service;

import com.SOF304.yennth.asm.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> listSinhVien;

    public SinhVienService() {
        listSinhVien = new ArrayList<>();
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    public void addSinhVien(SinhVien sinhvien) {
        listSinhVien.add(sinhvien);
    }

    public List<SinhVien> searchByMaSV(String masv) {
        List<SinhVien> listSV = new ArrayList<>();
        for (SinhVien sv : listSinhVien) {
            if (sv.getMasv().equals(masv)) {
                listSV.add(sv);
            }
        }
        return listSV;
    }
}
