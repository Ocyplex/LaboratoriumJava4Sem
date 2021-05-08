package com.company;

import java.io.File;

public class Animal {
    String name;
    private Double weight;
    static final public Double DEFAULT_ANIMAL_WEIGHT = 3.0;
    public final String species;
    File pic;
    Animal(String species){
        this.species = species;

        switch(this.species)
        {
            case "owczarek": this.weight = 20.0;
            case "pitbull":this.weight = 30.0;
            default:this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    void feed(){
        this.weight += 1;
        System.out.println("Karmimy");
    }

    void takeForAWalk()
    {
        this.weight -= 1;
        System.out.println("Wychodzimy");
        if(weight < 1)
        {
            System.out.println("Animal died");
        }

    }


}

