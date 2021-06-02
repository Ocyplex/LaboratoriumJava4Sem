package com.company;

public class Human {

    String name;
    String lastname;
    String gender;
    Integer age;
    String job;

    Animal pet;
    Car car;

    public Human(String name, String lastname, Integer age, Double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
    private  double salary;




    public  Double getSalary(){
        return this.salary;
    }
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }
}
