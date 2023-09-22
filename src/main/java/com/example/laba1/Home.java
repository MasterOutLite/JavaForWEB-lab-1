package com.example.laba1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Home {

    public Home(Integer countAll) {
        this.countCat = countAll;
        this.countDog = countAll;
        this.countRat = countAll;
    }

    private Dog dog;
    private Integer countDog;
    private CatFood catFood;
    private Integer countCat;
    private Rat rat;
    private Integer countRat;
}
