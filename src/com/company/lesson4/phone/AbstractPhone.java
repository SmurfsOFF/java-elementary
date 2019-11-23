package com.company.lesson4.phone;

public abstract class AbstractPhone {
    int year;

    public AbstractPhone(){

    }
    public AbstractPhone(int year){
this.year=year;
    }
    public void ring(){

    }
    public void call(){

    }
    public abstract void ring(int inNumber);
    public abstract void call(int outNumber);
}

