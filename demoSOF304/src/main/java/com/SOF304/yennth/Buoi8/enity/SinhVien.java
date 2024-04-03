package com.SOF304.yennth.Buoi8.enity;

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

    private String id;

    private String ten;

    private int lop;

    private String email;
}
