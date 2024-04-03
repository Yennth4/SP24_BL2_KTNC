package com.SOF304.yennth.Buoi8.service;
import com.SOF304.yennth.Buoi8.enity.SinhVien;
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

    public void addSinhVien(SinhVien sinhVien){
        listSinhVien.add(sinhVien);
        System.out.println("Them thanh cong sinh vien ID = " + sinhVien.getId());
    }

    public void deleteSinhVien(String id){
        for (int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getId().equalsIgnoreCase(id)){
                listSinhVien.remove(i);
                System.out.println("Xoa thanh cong id : " + id);
                return;
            }
        }
        System.out.println("Khong tim thay id : " + id);
    }
}
