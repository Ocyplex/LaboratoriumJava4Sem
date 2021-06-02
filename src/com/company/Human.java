package com.company;

public class Human {

    String name;
    String lastname;
    String gender;
    Integer age;
    String job;

    Animal pet;
    private Car car;

    public Human(String name, String lastname, Integer age, Double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
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
}}
