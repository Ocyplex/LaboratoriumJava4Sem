package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.Car;
import devices.Phone;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0, 300.0);
        Human human1 = new Human("Bolek","Zielony",22,2500.0,3900.0);
        Human human2 = new Human("Zosia","Dawna",23,10000.0,3000.0);

        Phone phone = new Phone("SAMSUNG","S10");
        Car car1 = new Car("BMW","E36");
        Car car2 = new Car("BMW","E36");
        Car car3 = new Car("Volkswagen","Passat");
        human2.setsCar(car3);
        human1.phone = phone;

        Pet piesek = new Pet("owczarek","Szarik");
        FarmAnimal swinka = new FarmAnimal("dzik","dzikus");

        piesek.feed();
        piesek.feed(5);
        swinka.feed(10);
        swinka.beEaten();

    }


}
