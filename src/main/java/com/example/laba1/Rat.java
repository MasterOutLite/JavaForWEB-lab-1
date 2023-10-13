package com.example.laba1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rat {

    @Value("Vlad")
    public String nameAnimal;

    @PostConstruct
    private void initHomeMethodFastNice(){
        System.out.println("Rat: PostConstruct.");
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Rat.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
