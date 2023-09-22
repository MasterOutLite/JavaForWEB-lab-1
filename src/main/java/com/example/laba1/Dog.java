package com.example.laba1;

public class Dog {
    public String nameAnimal;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(Dog.class + nameAnimal);
    }

    public String getNameAnimal(){
        return this.nameAnimal;
    }
}
