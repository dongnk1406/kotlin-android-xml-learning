package com.example.androidkotlinxml.practice;


public class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.getBrand() + " " + myCar.modelName);
    }

    @Override
    void speed() {
        System.out.println("Speed");
    }
}
