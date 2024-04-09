package com.SOF304.yennth.Buoi10.entity;

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
public class SinhVien {

    private String maSV;

    private String ten;

    private int tuoi;

    private float diemTB;

    private int kyHoc;

    private String chuyenNganh;

}
