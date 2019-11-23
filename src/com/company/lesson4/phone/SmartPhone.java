package com.company.lesson4.phone;

public class SmartPhone extends AbstractPhone{

    public SmartPhone(){

    }

    public SmartPhone(int year){

    }

    @Override
    public void ring(int inNumber) {
        System.out.println("Video ring "+inNumber);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Video Call " + outNumber);
    }
}