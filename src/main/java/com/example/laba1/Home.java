package com.example.laba1;

import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Home {
    @Autowired
    private void setDog(Dog dog){
        System.out.println("SetDog inside class Home. Autowired.");
        this.dog = dog;
    }

    @Autowired
    private CatFood catFood;
    private Dog dog;
    private Rat rat;
    @Autowired
    @Qualifier("dog")
    private MainBean been;

    @Value("${countAnimal}")
    Integer count;
    @PreDestroy
    private void destroy(){
        System.out.println(count);
    }
    @Autowired
    private void setMainBeen(@Qualifier("dog") MainBean been){
        System.out.println("Set mainBeen with qualifier. Benn is: dog.");
    }
}


//    public Home() {
//        //Dog dog, CatFood cat, Rat rat
//        this.dog = dog;
//        this.rat = rat;
//        this.catFood = cat;
//    }

