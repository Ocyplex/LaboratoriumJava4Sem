package com.company;

import jdk.jfr.Unsigned;

/*Moje notatki

            int a;
            Integer aa;
            final niezmienialne


 */


public class Main {


    public static void main(String[] args) {


        Human human = new Human("Edzio","Dawny",50,3000.0);
        human.getSalary();
        human.setSalary(-200.0);
        human.setSalary(5000.0);
        human.getSalary();

    }


}
