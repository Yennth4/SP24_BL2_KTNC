package com.SOF304.yennth.Buoi11.entity;

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
public class DongVat {

    private String maDV;

    private String ten;

    private String loai;

    private Double chieuCao;

    private String khuVucSong;

    private Double canNang;
}
