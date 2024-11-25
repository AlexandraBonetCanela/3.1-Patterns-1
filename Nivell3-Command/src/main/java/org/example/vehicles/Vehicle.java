package org.example.vehicles;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + " has started");
    }

    public void stop(){
        System.out.println(name + " has stopped");
    }

    public void accelerate(){
        System.out.println(name + " has accelerated");
    }
}
