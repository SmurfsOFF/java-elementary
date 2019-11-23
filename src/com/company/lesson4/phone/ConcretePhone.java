package com.company.lesson4.phone;

public class ConcretePhone extends AbstractPhone {

    public ConcretePhone(int year){
        this.year=year;
    }

    private void openConnection(){
        System.out.println("Open private connection");
    }

    @Override
    public void ring(int inNumber) {
        System.out.println(inNumber+" is ringing");
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Call to "+ outNumber+" by opened connection");
    }
}
