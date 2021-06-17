package com.company;

import devices.Car;
import devices.Phone;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0, 300.0);
        Human human1 = new Human("Bolek","Zielony",22,2500.0,3900.0);
        Human human2 = new Human("Zosia","Dawna",23,10000.0,3000.0);

        Animal animal = new Animal("owczarek","Szarik");
        Phone phone = new Phone("SAMSUNG","S10");
        Car car1 = new Car("BMW","E36");
        Car car2 = new Car("BMW","E36");
        Car car3 = new Car("Volkswagen","Passat");
        human2.setsCar(car3);
        human1.phone = phone;

        human.pet = animal;

        animal.sell(human,human1,400);
        car3.sell(human1,human,4000);
        car3.sell(human2,human1,4000);
        phone.sell(human1,human2,1000.0);
        car3.sell(human2,human1,4000);


    }


}
