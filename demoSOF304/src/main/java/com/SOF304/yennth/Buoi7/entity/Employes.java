package com.SOF304.yennth.Buoi7.entity;

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
public class Employes {

    private int id;

    private String fisrtName;

    private String lastName;

    private String email;

}
