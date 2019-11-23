package com.company.lesson5.Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String s;
        while (!(s = reader.readLine()).equals("")) {
            final int type = Integer.parseInt(s);
            Creature creature = createCreature(type);
            makeAction(creature);
        }

    }

    public static void callRun(Runnable runnable) {
        runnable.run();
    }

    public static void callSwim(Swimmable swimmable) {
        swimmable.swim();
    }

    public static void callFly(Flyable flyable) {
        flyable.fly();
    }

    public static Creature createCreature(final int type) {
        switch (type) {
            case 1:
                return new Human();
            case 2:
                return new Fish();
            case 3:
                return new Bird();
            default:
                throw new IllegalArgumentException("Unknown chess item type");
        }
    }

    public static void makeAction(Creature creature) {
        if (creature instanceof Swimmable) {
            callSwim((Swimmable) creature);
        }
        if (creature instanceof Runnable) {
            callRun((Runnable) creature);
        }
        if (creature instanceof Flyable) {
            callFly((Flyable) creature);

        }
    }
}