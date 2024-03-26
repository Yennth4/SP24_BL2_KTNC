package com.SOF304.yennth.Lab5.service;

import com.SOF304.yennth.Lab5.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    List<SanPham> listSanPham = new ArrayList<>();

    public List<SanPham> getAll() {
        return listSanPham;
    }

    public void addSanPham(SanPham sanPham) {
        if (sanPham.getSoLuong() >= 0 && sanPham.getSoLuong() <= 100) {
            listSanPham.add(sanPham);
            System.out.println("Thêm thành công");
            return;
        } else {
            throw new IllegalArgumentException("Số lượng phải là số nguyên dương và nhỏ hơn 100");
        }
    }

    public void updateSanPham(SanPham sanPham , String id) {
        for (int i = 0; i < listSanPham.size(); i++) {
            if (!listSanPham.get(i).getMaSanPham().equalsIgnoreCase(sanPham.getMaSanPham()) &&
                    listSanPham.get(i).getId().equalsIgnoreCase(id) &&
                    sanPham.getMaSanPham().startsWith("SP")) {
                listSanPham.set(i, sanPham);
                System.out.println("Sửa thành công");
                return;
            } else if (listSanPham.get(i).getMaSanPham().equalsIgnoreCase(sanPham.getMaSanPham())) {
                throw new IllegalArgumentException("Mã trùng lặp , vui lòng sửa lại mã");
            } else if (!sanPham.getMaSanPham().startsWith("SP")) {
                throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu là SP");
            } else {
                System.out.println("Sửa thất bại");
                return;
            }
        }
    }
}
