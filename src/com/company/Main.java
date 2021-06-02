package com.company;

import devices.Car;
import devices.Phone;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0);
        Animal animal = new Animal("owczarek");
        Phone phone = new Phone("SAMSUNG","S10");
        Car car1 = new Car("BMW","E36");
        Car car2 = new Car("BMW","E36");

        phone.turnOn();
        System.out.println(phone.toString());
        car1.turnOn();
        System.out.println(car1.toString());

    }


}
