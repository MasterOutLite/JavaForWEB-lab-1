package com.example.laba1;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Dog extends MainBean {

    public Dog(){
        System.out.println("Create class Dog.");
    }

    @Value("Jek")
    public String nameAnimal;

    @PreDestroy
    private void destroyObjectDog(){
        System.out.println("Pre destroy object class Dog.");
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Dog.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
