package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.List;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0, 300.0);
        Human human1 = new Human("Bolek","Zielony",22,2500.0,3900.0);
        Human human2 = new Human("Zosia","Dawna",23,10000.0,3000.0);

        Phone phone = new Phone("SAMSUNG","S10","192.186.0.1");
        phone.appToInstallList.add("Maps");
        phone.appToInstallList.add("FreeCoins");
        phone.appToInstallList.add("MyTaxes");
        Electric car1 = new Electric("Audi","Etron");
        Diesel car2 = new Diesel("BMW","E36");
        LPG car3 = new LPG("Volkswagen","Passat");
        human2.setsCar(car3);
        human1.phone = phone;

        car1.refuel();
        car3.refuel();
        car2.refuel();
        phone.installAnnApp("Buber");
        phone.installAnnApp("FreeRide","1.2","192.168.0.1");
        phone.installAnnApp("NuggetsForFree","1.0");
        phone.installAnnApp(phone.appToInstallList);


    }


}
