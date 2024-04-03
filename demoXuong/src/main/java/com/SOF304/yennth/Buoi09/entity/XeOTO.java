package com.SOF304.yennth.Buoi09.entity;

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
public class XeOTO {

    private int cardID;

    private String name;

    private String brand;

    private String model;

    private Double price;

    private int quantity;

    private int year;

    private String color;
}
