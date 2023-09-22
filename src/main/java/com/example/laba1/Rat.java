package com.example.laba1;

public class Rat {
    public String nameAnimal;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Rat.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
