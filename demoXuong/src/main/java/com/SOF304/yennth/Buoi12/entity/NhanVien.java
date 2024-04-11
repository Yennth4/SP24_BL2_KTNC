package com.SOF304.yennth.Buoi12.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NhanVien {

    private String maNV;

    private String ten;

    private String email;

    private String diaChi;

    private String chucVu;

    private int tienLuong;

}
