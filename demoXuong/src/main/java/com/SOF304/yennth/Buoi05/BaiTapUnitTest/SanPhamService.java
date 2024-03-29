package com.SOF304.yennth.Buoi05.BaiTapUnitTest;

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
        if (sanPham.getGia() < 0 || sanPham.getSoLuong() < 0) {
            throw new IllegalArgumentException("Giá và số lượng không được âm");
        } else if (!sanPham.getMaSP().startsWith("MX")) {
            throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu bằng 'MX'");
        } else {
            listSP.add(sanPham);
            System.out.println("Thêm thành công");
        }
    }

    public void updateSanPham(String maSP, SanPham sanPham) {
        if (sanPham.getGia() < 0 || sanPham.getSoLuong() < 0) {
            throw new IllegalArgumentException("Giá và số lượng không được âm");
        } else {
            for (int i = 0; i < listSP.size(); i++) {
                if (listSP.get(i).getMaSP().equalsIgnoreCase(maSP)) {
                    listSP.set(i, sanPham);
                    System.out.println("Sua thanh cong!!!");
                    return;
                }
            }
        }

    }

    public void deleteSanPham(String maSP) {
        for (int i = 0; i < listSP.size(); i++) {
            if (listSP.get(i).getMaSP().equalsIgnoreCase(maSP)) {
                listSP.remove(i);
                System.out.println("Xoa thanh cong ma: " + maSP);
                return;
            }
        }
        System.out.println("Khong tim thay san pham ma: " + maSP);
    }
}
