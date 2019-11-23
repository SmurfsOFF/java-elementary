package com.company.lesson6;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> someList = new ArrayList<User>();

        someList.add(new User("Alex", 16));
        someList.add(new User("Dmitry", 21));
        someList.add(new User("Alex2", 16));
        someList.add(new User("Dmitry2", 21));
        someList.add(new User("Alex3", 16));
        someList.add(new User("Dmitry3", 21));
        someList.add(new User("Alex4", 16));
        someList.add(new User("Dmitry4", 21));
        someList.add(new User("Alex5", 16));
        someList.add(new User("Dmitry5", 21));

        User[] array = new User[15];


        for (int i = 0; i < someList.size(); i++) {
            array[i] = someList.get(i);
        }

        System.out.println("Print list");
        for (User user : someList) {
            System.out.println(user.getName() + "");
        }

        System.out.println("Print array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }

        someList.add(4, new User("Vova", 18));
        System.out.println();
        System.out.println("Print array after add by index");
        for (User user : someList) {
            System.out.println(user + "");
        }
    }
}

