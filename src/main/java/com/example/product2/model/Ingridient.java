package com.example.product2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingridient {
    private  String name;
    private  int quantity;
    private String dimension ;
}
