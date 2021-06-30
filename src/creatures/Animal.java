package creatures;

import com.company.Human;
import com.company.Sellable;

import java.io.File;

public abstract class Animal implements Sellable, Feedable {
    String name;
    private Double weight;
    static final public Double DEFAULT_ANIMAL_WEIGHT = 3.0;
    public final String species;
    File pic;

    Animal(String species, String name) {
        this.species = species;
        this.name = name;
        switch (this.species) {
            case "owczarek":
                this.weight = 20.0;
            case "pitbull":
                this.weight = 30.0;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
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


    public void feed() {
        this.weight += 1;
        System.out.println("Karmimy " + this.name);
    }

    public void feed(Integer foodWeight){
        this.weight += foodWeight;
        System.out.println((this.name) + " otrzymal " + foodWeight +" karmy");
    }



    void takeForAWalk() {
        this.weight -= 1;
        System.out.println("Wychodzimy z " + this.name);
        if (weight < 1) {
            System.out.println(this.name + " died");
        }

    }

    /*
    @Override
    public void sell(Human humanSeller, Human humanBuyer, double price) {
        if(humanSeller.pet==null)
        {
            System.out.println(humanSeller.name + " nieposiada zwierzecia");
            return;
        }
        if (humanSeller.pet.hashCode() == Animal.this.hashCode() ){ //Sprawdzenie czy wlasciciel posiada to zwierze


            if (humanBuyer.cash > price)//Zakup Przelew + Zapisanie zwierzecia
            {
                humanBuyer.pet = humanSeller.pet;
                humanSeller.pet = null;
                humanBuyer.cash = humanBuyer.cash - price;
                humanSeller.cash = humanSeller.cash + price;
                System.out.println(humanSeller.name + " sprzedaje " + this.name + " do " + humanBuyer.name + " za "  + price);
                System.out.println(humanSeller.name +"nowy Stankonta:" +humanSeller.cash);
                System.out.println(humanBuyer.name +" nowy Stankonta:" +humanBuyer.cash);
            }else {
                System.out.println(humanBuyer.name + " nie posiada wystarczajaco pieniedzy!");
            }
        } else {
            System.out.println(humanSeller.name + "nieposiada tego zwierzecia!");
        }
    }
    */

}

