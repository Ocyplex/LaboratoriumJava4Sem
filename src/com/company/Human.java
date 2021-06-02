package com.company;

public class Human {

    String name;
    String lastname;
    String gender;
    Integer age;
    String job;



    Animal pet;

    public Human(Double salary) {
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
