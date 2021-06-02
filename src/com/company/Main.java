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
            System.out.println("Dogname = "+ dog.name);
            System.out.println("Rasa = "+ dog.species);

            Phone iphone = new Phone();
            iphone.producer = "apple";
            iphone.model = "10";



        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Human human = new Human(100.0);





    }


}
