package com.SOF304.yennth.Buoi09.service;

import com.SOF304.yennth.Buoi09.entity.XeOTO;

import java.util.ArrayList;
import java.util.List;

public class XeOTOService {

    List<XeOTO> listXeOto = new ArrayList<>();

    public List<XeOTO> getAll() {
        return listXeOto;
    }

    public void addXe(XeOTO xeOTO) {
        if (xeOTO.getName().matches("^[a-zA-Z0-9 ]+$") && xeOTO.getName() != null && !xeOTO.getName().isEmpty() && xeOTO != null) {
            listXeOto.add(xeOTO);
            System.out.println("Thêm thành công xe " + xeOTO.getName());
        } else {
            throw new IllegalArgumentException("Tên xe không được chứa ký tự đặc biệt");
        }
    }

    public List<XeOTO> searchTenXe(String name) {
        List<XeOTO> lists = new ArrayList<>();
        for (XeOTO xeOTO : listXeOto) {
            if (xeOTO.getName().equalsIgnoreCase(name)) {
                lists.add(xeOTO);
            }
        }
        System.out.println("Dang co " + lists.size() + " o to voi ten la " + lists.get(0).getName());
        return lists;
    }

    public List<XeOTO> searchHangXe(String brand) {
        List<XeOTO> lists = new ArrayList<>();
        for (XeOTO xeOTO : listXeOto) {
            if (xeOTO.getName().equalsIgnoreCase(brand)) {
                lists.add(xeOTO);
            }
        }
        System.out.println("Dang co " + lists.size() + " o to voi hang la " + lists.get(0).getBrand());
        return lists;
    }

}
