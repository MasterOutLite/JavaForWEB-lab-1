package com.example.laba1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class CatFood {

    @Autowired
    public CatFood(Cat cat){
        System.out.println("Constructor autowired Cat dependencies.");
        this.cat = cat;
    }

    private Cat cat;
    private String nameCatFood;
    private Float amountFood;
}
