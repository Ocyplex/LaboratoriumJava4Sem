package com.company;

import jdk.jfr.Unsigned;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0);
        Car car = new Car("BMW","E36");
        car.value = 2000.0;
        human.setCar(car);

    }


}
