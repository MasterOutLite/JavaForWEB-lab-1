package com.example.laba1;

public class Cat {
    public String nameAnimal;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Cat.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
