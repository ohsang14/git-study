package com.example.gitstudy2.java;

public class GitStudy2Application {
    public static void main(String[] args) {
        printVehicle(new Car());
        printVehicle(new MotoCycle());
    }
    public static void printVehicle (Vehicle vehicle){
        vehicle.drive();
    }
}
