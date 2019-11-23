package com.company.lesson4.phone;

public class WirelessPhone extends AbstractPhone {

    public static final int MAX_WORK_HOURS=5;
    private int workHours;

    public WirelessPhone() {
    }

    public WirelessPhone(int year) {
        super(year);
    }

    public WirelessPhone(int year, int workHours){
        super(year);
        this.workHours=workHours;
    }

    @Override
    public void ring(int inNumber) {

    }

    @Override
    public void call(int outNumber) {
        if (workHours<=MAX_WORK_HOURS){
            System.out.println("WIreless call to "+outNumber);
        } else {
            System.out.println("Wireless Phone is dead");
        }
    }
}
