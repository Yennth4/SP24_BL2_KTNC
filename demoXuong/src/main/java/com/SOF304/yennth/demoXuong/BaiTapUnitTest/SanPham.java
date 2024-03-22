package com.SOF304.yennth.demoXuong.BaiTapUnitTest;

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
public class SanPham {

    private String id;

    private String maSP;

    private String tenSP;

    private float gia;

    private String mauSac;

    private String kichThuoc;

    private int soLuong;

}
