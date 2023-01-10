package com.example.product2.services;

import com.example.product2.model.Ingridient;
import com.example.product2.services.Impl.IngridientImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;



public interface IngridientService {


    int   addIngridient(Ingridient ingridient);

    Ingridient getIngridient(Integer id);

    String getName();
    int getQuantity();
    String getDimension();
}
