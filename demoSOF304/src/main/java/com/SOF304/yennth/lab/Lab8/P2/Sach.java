package com.SOF304.yennth.lab.Lab8.P2;

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
public class Sach {

    private String id;

    private String ten;

    private int soTrang;

    private String tenTacGia;

    private int lanTaiBan;
}
