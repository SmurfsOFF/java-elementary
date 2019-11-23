package com.company.lesson5.Interfaces;

public class Fish extends Creature implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Fish swim");
    }
}
