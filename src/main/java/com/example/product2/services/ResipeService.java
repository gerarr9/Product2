package com.example.product2.services;

import com.example.product2.model.Recipe;

import java.util.Map;

public interface ResipeService {
    int addRecipe(Recipe recipe);


    Recipe  getRecipe(Integer id);
}
