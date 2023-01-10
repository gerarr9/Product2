package com.example.product2.controllers;

import com.example.product2.model.Ingridient;
import com.example.product2.model.Recipe;
import com.example.product2.services.ResipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/recipe")
public class RecipeController {
    private ResipeService recipes;

    public RecipeController(ResipeService recipes) {
        this.recipes = recipes;
    }

    @PostMapping
    public ResponseEntity<Integer>addRecipe(@RequestBody Recipe recipe){
        int id =  recipes.addRecipe(recipe);
        return  ResponseEntity.ok(id);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> recipetList(@PathVariable Integer id){
        Recipe recipe =  recipes.getRecipe(id);
        return  ResponseEntity.ok(recipe);
    }
}
