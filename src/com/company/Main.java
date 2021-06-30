package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.List;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0, 300.0,3);
        Human human1 = new Human("Bolek","Zielony",22,2500.0,3900.0,3);
        Human human2 = new Human("Zosia","Dawna",23,10000.0,10000.0,3);

        Phone phone = new Phone("SAMSUNG","S10","192.186.0.1");
        phone.appToInstallList.add("Maps");
        phone.appToInstallList.add("FreeCoins");
        phone.appToInstallList.add("MyTaxes");
        Electric car1 = new Electric("Audi","Etron",4000.0,2015);
        Diesel car2 = new Diesel("BMW","E36",1500.0,1995);
        LPG car3 = new LPG("Volkswagen","Passat",2500.0,2000);
        human1.phone = phone;


        human1.setsCar(car1);
        human1.setsCar(car2);
        human.setsCar(car3);
        car3.sell(human,human2);
        human1.garageValue();
        car1.sell(human1,human2);
        car2.sell(human1,human2);
        human2.garageValue();

    }


}
