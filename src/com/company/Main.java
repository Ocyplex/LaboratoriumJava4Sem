package com.company;

import jdk.jfr.Unsigned;

/*Moje notatki

            int a;
            Integer aa;
            final niezmienialne


 */


public class Main {


    public static void main(String[] args) {

        Animal dog = new Animal("owczarek");
	        dog.name ="Szarik";

            Phone iphone = new Phone();
            iphone.producer = "apple";
            iphone.model = "10";


        /*
        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        */

        Human human = new Human("Edzio","Dawny",50,3000.0);

        Car vwpassat = new Car("Volkswagen","Passat");
        human.car = vwpassat;

        System.out.println("Samochod od " + human.name +" to " + vwpassat.producer+" " + vwpassat.model);





    }


}
