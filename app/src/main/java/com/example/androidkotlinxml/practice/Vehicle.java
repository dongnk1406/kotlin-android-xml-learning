package com.example.androidkotlinxml.practice;

public abstract class Vehicle {
    private String brand = "Ford";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    abstract void speed();
}
