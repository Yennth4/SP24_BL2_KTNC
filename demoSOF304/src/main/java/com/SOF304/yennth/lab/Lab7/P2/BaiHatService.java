package com.SOF304.yennth.lab.Lab7.P2;

import java.util.ArrayList;
import java.util.List;


public class BaiHatService {

    List<BaiHat> listBaiHat = new ArrayList<>();

    public List<BaiHat> getAll() {
        return listBaiHat;
    }

    public void delete(String id){
        for (BaiHat bh : listBaiHat) {
            if (bh.getId().equals(id)) {
                listBaiHat.remove(bh);
                break;
            }
        }
        System.out.println("Xoa thanh cong id: " + id);
    }


    public void add(BaiHat bh) {
        if (bh.getDoDai() > 0 && bh != null) {
            listBaiHat.add(bh);
            System.out.println("Them thanh cong bai hat co id:  " + bh.getId());
        } else {
            throw new IllegalArgumentException("Phải là số nguyên dương");
        }
    }



}
