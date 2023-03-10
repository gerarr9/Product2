package com.example.product2.controllers;

import com.example.product2.model.Ingridient;
import com.example.product2.services.Impl.IngridientImpl;
import com.example.product2.services.IngridientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/ingridients")
public class IngridientConsolle {
    private IngridientService ingridients;

    public IngridientConsolle(IngridientService ingridients) {
        this.ingridients = ingridients;
    }

    @PostMapping
    public ResponseEntity<Integer> addProduct(@RequestBody Ingridient ingridient){
        int id = ingridients.addIngridient(ingridient);
        return  ResponseEntity.ok(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingridient> ingridientList(@PathVariable Integer id){
      Ingridient ingridient =  ingridients.getIngridient(id);
      return  ResponseEntity.ok(ingridient);
    }
}
