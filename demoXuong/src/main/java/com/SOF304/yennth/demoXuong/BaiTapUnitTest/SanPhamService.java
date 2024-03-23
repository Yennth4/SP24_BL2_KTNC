package com.SOF304.yennth.demoXuong.BaiTapUnitTest;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    public List<SanPham> listSP;

    public SanPhamService() {

        listSP = new ArrayList<>();

    }

    public List<SanPham> getAll() {
        return listSP;
    }

    public boolean checkSoLuongHopLe(int soLuong) {
        return (soLuong > 0 && soLuong < 100);
    }

    public void addSanPham(SanPham sanPham) {
        if (checkSoLuongHopLe(sanPham.getSoLuong())){
            listSP.add(sanPham);
            System.out.println("Them thanh cong");
        } else {
            System.out.println("So luong khong hop le !!! Moi nhap lai");
        }
    }

    public void updateSanPham(String maSP , SanPham sanPham) {
        for (int i = 0; i < listSP.size(); i++) {
            if (listSP.get(i).getMaSP().equalsIgnoreCase(maSP)){
                listSP.set(i, sanPham);
                System.out.println("Sua thanh cong!!!");
                return;
            }
        }

    }

    public void deleteSanPham(String maSP) {
        for (int i = 0; i < listSP.size(); i++) {
            if (listSP.get(i).getMaSP().equalsIgnoreCase(maSP)){
                listSP.remove(i);
                System.out.println("Xoa thanh cong ma: " + maSP);
                return;
            }
        }
        System.out.println("Khong tim thay san pham ma: " + maSP);
    }
}
