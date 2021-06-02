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

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                ", pic=" + pic +
                '}';
    }

    void feed(){
        this.weight += 1;
        System.out.println("Karmimy " + this.name);
    }

    void takeForAWalk()
    {
        this.weight -= 1;
        System.out.println("Wychodzimy z " + this.name );
        if(weight < 1)
        {
            System.out.println(this.name +" died");
        }

    }


}

