package com.SOF304.yennth.Buoi11.service;


import com.SOF304.yennth.Buoi11.entity.DongVat;

import java.util.ArrayList;
import java.util.List;

public class DongVarService {

    private List<DongVat> listDongVat;

    public DongVarService() {
        listDongVat = new ArrayList<>();

        listDongVat.add(new DongVat("DV1", "Mao", "Meo", 15d, "Nha", 10d));
        listDongVat.add(new DongVat("DV2", "Vit", "Cho", 18d, "Nha", 15d));

    }

    public List<DongVat> getAll() {
        return listDongVat;
    }

    public void them(DongVat dongVat) {
        if (checkValidate(dongVat)) {
            listDongVat.add(dongVat);
            System.out.println("Them thanh cong con " + dongVat.getTen());
        }
    }

    public void sua(DongVat dongVat) {
        for (int i = 0; i < listDongVat.size(); i++) {
            if (listDongVat.get(i).getMaDV().equalsIgnoreCase(dongVat.getMaDV()) && checkValidate(dongVat)) {
                listDongVat.set(i, dongVat);
            }
        }
        System.out.println("Sua thanh cong con " + dongVat.getTen());
    }

    public void xoa(DongVat dongVat) {
        for (int i = 0; i < listDongVat.size(); i++) {
            if (listDongVat.get(i).getMaDV().equalsIgnoreCase(dongVat.getMaDV()) && checkValidate(dongVat)) {
                listDongVat.remove(i);
            }
        }
        System.out.println("Xoa thanh cong con " + dongVat.getTen());
    }

    public boolean checkValidate(DongVat dongVat) {
        if (dongVat.getCanNang() > 100 || dongVat.getChieuCao() > 100) {
            throw new IllegalArgumentException("Chiều cao và cân nặng không quá 100.");
        }
        if (dongVat.getCanNang() < 0 || dongVat.getChieuCao() < 0) {
            throw new IllegalArgumentException("Chiều cao và cân nặng phải là số dương");
        }
        return true;
    }
}
