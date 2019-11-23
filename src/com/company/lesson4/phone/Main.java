package com.company.lesson4.phone;

import com.sun.source.tree.IfTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String phoneName=reader.readLine();

        ConcretePhone concretePhone=new ConcretePhone(1989);

        concretePhone.ring(1337);
        concretePhone.call(333221);

        SmartPhone smartPhone=new SmartPhone(2019);
        smartPhone.ring(999);
        smartPhone.call(666);

        User user=new User();
        user.callToNumber(getPhone(1),666);
        user.callToNumber(getPhoneName(phoneName),1562);
    }

    public static AbstractPhone getPhone(int number){
        if (number==1){
            return new ConcretePhone(1989);
        }else {
            return new SmartPhone(2019);
        }
    }
    public static AbstractPhone getPhoneName(String phoneName){
        if (phoneName.equals("conc")){
            return new ConcretePhone(1989);
        }else if (phoneName.equals("smartik")){
            return new SmartPhone(2019);
        }else if(phoneName.equals("wireless")){
            return new WirelessPhone(2018,4);
        }else {
            throw new IllegalArgumentException();
        }
    }
}
