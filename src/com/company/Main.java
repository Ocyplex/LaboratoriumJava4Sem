package com.company;

import jdk.jfr.Unsigned;

public class Main {


    public static void main(String[] args) {
	Animal dog = new Animal("owczarek");
	dog.name ="Szarik";

    // dog.weight = 22.0;

            System.out.println("Dogname = "+ dog.name);
            System.out.println("Rasa = "+ dog.species);

            Phone iphone = new Phone();
            iphone.producer = "apple";
            iphone.model = "10";


            int a;
            Integer aa;


            //final niezmienialne


        dog.takeForAWalk();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Human human = new Human(100.0);





    }


}
