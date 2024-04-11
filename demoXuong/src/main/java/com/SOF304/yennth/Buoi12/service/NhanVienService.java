package com.SOF304.yennth.Buoi12.service;

import com.SOF304.yennth.Buoi12.entity.NhanVien;
import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    List<NhanVien> listNV;

    public NhanVienService() {
        listNV = new ArrayList<>();

        listNV.add(new NhanVien("NV1", "Nguyen Hai Yen", "yen@gmail.com", "HN", "Giam doc", 100000));
    }

    public List<NhanVien> getAll() {
        return listNV;
    }

    public void them(NhanVien nhanVien) {
        listNV.add(nhanVien);
        System.out.println("Them thanh cong giam doc " + nhanVien.getTen());
    }

    public void sua(NhanVien nhanVien) {
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(nhanVien.getMaNV()) && checkValidate(nhanVien)) {
                listNV.set(i , nhanVien);
            }
        }
        System.out.println("Sua thanh cong giam doc " + nhanVien.getTen());
    }

    public void xoa(NhanVien nhanVien) {
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getMaNV().equalsIgnoreCase(nhanVien.getMaNV()) && checkValidate(nhanVien)) {
                listNV.remove(i);
            }
        }
        System.out.println("Xoa thanh cong id " + nhanVien.getMaNV());
    }

    public boolean checkValidate(NhanVien nhanVien) {
        if (nhanVien.getTienLuong() < 0 ) {
            throw new IllegalArgumentException("Tienluong phải là số dương");
        }
        if (nhanVien.getTienLuong() > 50000000) {
            throw new IllegalArgumentException("Tienluong không quá 50.000.000 VNĐ");
        }
        return true;
    }
}
