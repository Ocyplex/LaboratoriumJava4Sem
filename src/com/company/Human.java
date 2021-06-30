package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

public class Human{

    public String name;
    String lastname;
    String gender;
    Integer age;
    String job;
    public Double cash;

    Animal pet;
    private Car car;
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
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }

    public Human(String name, String lastname, Integer age, Double salary, Double cash) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
        this.cash = cash;
    }
    private  double salary;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(salary > car.value)
        {
            if ( car.value+(car.value/12) > salary)
            {
                System.out.println("Kupiles auto na kredyt");
                this.car = car;
            }else{
                System.out.println("Gratulacje kupiles samochod i to bez kredytu");
                this.car = car;
            }
        }else{
            System.out.println("Nie stac cie na ten samochod. Zmien Prace czy cos tam!");
        }

    }
    public void setsCar(Car car)//Wpisywanie samochodu
    {
        this.car = car;
    }

    public  Double getSalary(){
        System.out.println("Pobrano informacje o wyplacie w " + java.util.Calendar.getInstance().getTime());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double salary)
        {
        if(salary > 0){
        this.salary = salary;
            System.out.println("Nowa wyplata zostala wyslana do systemu ksiegowego");
            System.out.println("Prosze odebrac aneks do umowy od pani Hani z Kadru");
            System.out.println("ZUS i US Wiedza o zmianie w wyplacie, prosze nie ukrywac tego");
        }
        else
        {
            System.out.println("Niemozna przepisac ujemnej wartosci");
        }
        }

}
