package com.example.laba1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends MainBean {

    public Cat(){
        System.out.println("Create class Cat.");
    }

    @Value("Nemov")
    public String nameAnimal;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Cat.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
