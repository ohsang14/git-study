package com.example.gitstudy2.java;

import com.example.gitstudy2.java.classz.Car;
import com.example.gitstudy2.java.classz.MotoCycle;
import com.example.gitstudy2.java.classz.Vehicle;

public class GitStudy2Application {
    public static void main(String[] args) {
        printVehicle(new Car());
        printVehicle(new MotoCycle());
    }
    public static void printVehicle (Vehicle vehicle){
        vehicle.drive();
    }
}
