package com.example.androidkotlinxml.learn_interface;

public class PigAnimal implements IAnimal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {
        System.out.println("The pig is running");
    }
}

