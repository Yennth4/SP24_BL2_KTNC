package com.SOF304.yennth.Buoi7.service;
import com.SOF304.yennth.Buoi7.entity.XeOTO;
import java.util.ArrayList;
import java.util.List;

public class XeOTOService {
    private List<XeOTO> listXeOTO;

    public XeOTOService() {
        listXeOTO = new ArrayList<>();
    }

    public List<XeOTO> getAll() {
        return listXeOTO;
    }

    public void addXeOTO(XeOTO xeOTO) {
        listXeOTO.add(xeOTO);
        System.out.println("Them thanh cong");
    }

    public void updateXeOTO(XeOTO xeOTO , int id) {
        for (int i = 0; i < listXeOTO.size(); i++) {
            if (listXeOTO.get(i).getId() == id) {
                listXeOTO.set(i, xeOTO);
                System.out.println("Sua thanh cong id: " + id);
                return;
            }
        }
        System.out.println("Khong tim thay id : " + id);
    }

    public void deleteXeOTO(int id) {
        listXeOTO.removeIf(xeOTO -> xeOTO.getId() == id);
        System.out.println("Xoa thanh cong id: " + id);
    }

    public XeOTO searchXeOTO(int id) {
        for (XeOTO xe : listXeOTO) {
            if (xe.getId() == id) {
                System.out.println("Tìm thấy ID: " + id);
                return xe;
            }
        }
        System.out.println("Không tìm thấy ID: " + id);
        return null;
    }
}
