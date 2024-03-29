package com.SOF304.yennth.Buoi08.service;

import com.SOF304.yennth.Buoi08.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    List<SanPham> listSanPham;

    public SanPhamService() {
        listSanPham = new ArrayList<>();
    }

    public List<SanPham> getAll() {
        return listSanPham;
    }

    public void addSanPham(SanPham sanPham) {
        if (sanPham.getGia() < 0 || sanPham.getSoLuong() < 0) {
            throw new IllegalArgumentException("Giá và số lượng không được âm");
        } else if (!sanPham.getMaSP().startsWith("MX")) {
            throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu bằng 'MX'");
        } else {
            listSanPham.add(sanPham);
            System.out.println("Thêm thành công");
        }
    }

    public void updateSanPham(String id, SanPham sanPham) {
        if (sanPham.getGia() < 0 || sanPham.getSoLuong() < 0) {
            throw new IllegalArgumentException("Giá và số lượng không được âm");
        } else {
            for (int i = 0; i < listSanPham.size(); i++) {
                if (listSanPham.get(i).getId().equalsIgnoreCase(id)) {
                    listSanPham.set(i, sanPham);
                    System.out.println("Sửa thành công!!!");
                }
            }
        }
    }

    public void removeSanPham(String id) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (listSanPham.get(i).getId().equalsIgnoreCase(id)) {
                listSanPham.remove(i);
                System.out.println("Xóa thành công id: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm id: " + id);
    }
}
