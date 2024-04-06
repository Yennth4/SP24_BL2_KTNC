package com.SOF304.yennth.lab.Lab8.P2;

import java.util.ArrayList;
import java.util.List;

public class SachService {

    List<Sach> lists = new ArrayList<>();

    public List<Sach> getLists() {
        return lists;
    }

    public void addSach(Sach s) {
        if (!isValidTitle(s.getTen())) {
            throw new IllegalArgumentException("Tiêu đề sách không được chứa ký tự đặc biệt.");
        } else if (s != null && s.getId().isEmpty() && s.getId() != null) {
            lists.add(s);
            System.out.println("Them thanh cong id " + s.getId());
        }
    }

    public List<Sach> timSachTheoTacGia(String tenTacGia) {
        List<Sach> ketQuaTimKiem = new ArrayList<>();
        for (Sach sach : lists) {
            if (sach.getTenTacGia().equalsIgnoreCase(tenTacGia)) {
                ketQuaTimKiem.add(sach);
            }
        }
        return ketQuaTimKiem;
    }

    private boolean isValidTitle(String title) {
        return title.matches("[a-zA-Z0-9\\s]+");
    }
}
