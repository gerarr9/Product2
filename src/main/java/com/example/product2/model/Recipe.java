package com.example.product2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recipe {
    private String name;
    private  int time;
    private  Ingridient ingridient;
    private  String steps;

}
