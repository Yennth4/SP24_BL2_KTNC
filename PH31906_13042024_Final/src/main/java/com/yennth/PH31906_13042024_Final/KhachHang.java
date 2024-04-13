package com.yennth.PH31906_13042024_Final;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class KhachHang {

    private String maKH;

    private String tenKH;

    private String gioiTinh;

    private Integer namSinh;

    private String loaiKH;
}
