package com.company;

public class Phone {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;

    public Phone(String producer, String model){
        this.producer = producer;
        this.model = model;
 }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
