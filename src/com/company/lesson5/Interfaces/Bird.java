package com.company.lesson5.Interfaces;

public class Bird extends Creature implements Flyable,Runnable {
    @Override
    public void fly() {
        System.out.println("Bird is fly");
    }

    @Override
    public void run() {
        System.out.println("Bird is run");
    }
}
