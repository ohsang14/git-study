package com.example.gitstudy2.java.classz;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car");
    }

    @Override
    public void addFuel() {
        System.out.println("addFuel");
    }
}
