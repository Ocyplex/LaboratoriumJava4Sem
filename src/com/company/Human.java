package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

public class Human {

    public String name;
    String lastname;
    String gender;
    Integer age;
    String job;
    public Double cash;
    public Car[] garage;
    Double garageValue = 0.0;


    Animal pet;
    public Phone phone;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", cash=" + cash +
                ", pet=" + pet +
                //", car=" + car +
                ", salary=" + salary +
                '}';
    }

    public Human(String name, String lastname, Integer age, Double salary, Double cash, Integer garageMiejsc) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.cash = cash;
        garage = new Car[garageMiejsc];
    }

    private double salary;


    public Car getCar(Integer garageMiejsce) {
        return garage[garageMiejsce];
    }

    public void setCar(Car car) {
        int i = 0;
        for (; i < garage.length; i++) {
            if (garage[i] != null) {

            } else {
                System.out.println(name + " ma wolne miejsce");
                break;
            }
        }
        if (salary > car.value) {
            if (car.value + (car.value / 12) > salary) {
                this.garage[i] = car;
                System.out.println("Kupiles auto na kredyt");
            } else {
                System.out.println("Gratulacje kupiles samochod i to bez kredytu");
                this.garage[i] = car;
            }
        } else {
            System.out.println("Nie stac cie na ten samochod. Zmien Prace czy cos tam!");
        }

    }

    public void setsCar(Car car)//Wpisywanie samochodu
    {
        int i = 0;
        while (i < garage.length) {
            if (garage[i] == null) {
                garage[i] = car;
                System.out.println(name + lastname + garage[i]);
                break;
            } else {
                i++;
            }
        }
    }


    public Double getSalary() {
        System.out.println("Pobrano informacje o wyplacie w " + java.util.Calendar.getInstance().getTime());
        System.out.println(this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Nowa wyplata zostala wyslana do systemu ksiegowego");
            System.out.println("Prosze odebrac aneks do umowy od pani Hani z Kadru");
            System.out.println("ZUS i US Wiedza o zmianie w wyplacie, prosze nie ukrywac tego");
        } else {
            System.out.println("Niemozna przepisac ujemnej wartosci");
        }
    }

    public void garageValue() {
        for (int i = 0; garage.length > i; i++) {
            if (garage[i] != null) {
                garageValue += garage[i].value;
            } else {
                break;
            }
            System.out.println("Wartosc garazu wynosi " + garageValue);
        }

    }

    public void garageSort(){


        for(int i = 0;i< garage.length;i++)
        {
           if(garage[i].yearOfProduction > garage[i+1].yearOfProduction){

               garage[i+1].yearOfProduction = garage[i].yearOfProduction;
           }

        }
    }
}

