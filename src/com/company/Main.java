package com.company;

import jdk.jfr.Unsigned;


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0);
        Animal animal = new Animal("owczarek");
        Phone phone = new Phone("SAMSUNG","S10");
        Car car1 = new Car("BMW","E36");
        Car car2 = new Car("BMW","E36");


        System.out.println(car1 + car1.producer +car1.model);
        System.out.println(car2 + car2.producer +car2.model);

        if(car1.equals(car2))
        {
            System.out.println("Takie same");
        }else{
            System.out.println("Nie takie same");
        }
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        if((car1.toString().compareTo(car2.toString()))==0){
            System.out.println("Takie same");
        }else{
            System.out.println("Nie takie same");
        }

        System.out.println(human.toString());
        System.out.println(animal.toString());
        System.out.println(phone.toString());

    }


}
