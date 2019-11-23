package com.company.lesson5;

public class Queen extends AbstractChessItem implements Drawable,HasValue {

    public Queen(){
        System.out.println("Queen()");
    }

    public Queen(int x, int y) {
        super(x, y);
        System.out.println("Queen(int x, int y)");
    }

    public Queen(int x, int y, int value) {
        super(x, y, value);
        System.out.println(" Queen(int x, int y, int value)");
    }

    @Override
    public void draw() {
        System.out.println("Draw Queen");

    }

    @Override
    public int getValue() {
        return 0;
    }
}
