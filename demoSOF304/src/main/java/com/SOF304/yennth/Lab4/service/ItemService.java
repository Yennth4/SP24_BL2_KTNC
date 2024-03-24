package com.SOF304.yennth.Lab4.service;

import com.SOF304.yennth.Lab4.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {

    List<Item> listItem;

    public ItemService() {
        listItem = new ArrayList<>();
    }

    public List<Item> getAll() {
        return listItem;
    }

    public void addItem(Item item) {
        if (!item.getName().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Tên phải là chữ ");
        }
        if (item.getName().length() > 50) {
            throw new IllegalArgumentException("Tên phải có độ dài nhỏ hơn 50 ");
        }
        listItem.add(item);
        System.out.println("Them thanh cong");
    }

    public void updateItem(int id, String newName) {
        for (Item item : listItem) {
            if (item.getId() == id) {
                item.setName(newName);
                System.out.println("Sua thanh cong id: " + id);
                return;
            }
        }
        System.out.println("Khong tim thay id: " + id);
    }

    public void deleteItem(int id) {
        listItem.removeIf(item -> item.getId() == id);
        System.out.println("Xoa thanh cong id: " + id);
    }
}
