package com.yennth.PH31906_13042024_Final;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {

    List<KhachHang> list = new ArrayList<>();

    public List<KhachHang> getAll() {
        return list;
    }

    public void add(KhachHang khachHang) {
        list.add(khachHang);
        System.out.println("Them thanh cong ma " + khachHang.getMaKH());
    }

    public void xoa(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).getMaKH().equalsIgnoreCase(ma)) {
                throw new IllegalArgumentException("Khong tim thay ma " + ma);
            } else {
                if (String.valueOf(list.get(i).getNamSinh()).length() < 4) {
                    throw new IllegalArgumentException("Nam sinh phai gom it nhat 4 chu so");
                } else {
                    list.remove(i);
                }
            }
        }
        System.out.println("Xoa thanh cong ma " + ma);
    }

}
