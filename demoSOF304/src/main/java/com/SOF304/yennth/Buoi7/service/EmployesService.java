package com.SOF304.yennth.Buoi7.service;

import com.SOF304.yennth.Buoi7.entity.Employes;

import java.util.ArrayList;
import java.util.List;

public class EmployesService {

    private List<Employes> listEmployes;

    public EmployesService() {
        listEmployes = new ArrayList<>();
    }

    public List<Employes> getAll() {
        return listEmployes;
    }

    public void addEmployes(Employes employes) {
        listEmployes.add(employes);
        System.out.println("Them thanh cong");
    }

    public void updateEmployes(Employes employes , int id) {
        for (int i = 0; i < listEmployes.size(); i++) {
            if (listEmployes.get(i).getId() == id) {
                listEmployes.set(i, employes);
                System.out.println("Sua thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay id : " + id);
    }

    public boolean deleteEmployes(int id) {
        for (int i = 0; i < listEmployes.size(); i++) {
            if (listEmployes.get(i).getId() == id) {
                listEmployes.remove(i);
                System.out.println("Xóa thành công ID: " + id);
                return true; // Trả về true khi xóa thành công
            }
        }
        System.out.println("Không tìm thấy ID: " + id);
        return false; // Trả về false khi không tìm thấy ID
    }

}
