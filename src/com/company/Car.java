package com.company;

public class Car {

    public final String producer;
    public final String model;
    public Double value;

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", value=" + value +
                '}';
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }
}
