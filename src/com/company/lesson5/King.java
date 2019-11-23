package com.company.lesson5;

public class King extends AbstractChessItem implements Drawable,HasValue {
    public King(){
        System.out.println("King()");
    }
    public King(int x, int y){
        super(x,y);
        System.out.println("King(int x, int y");
    }

    public King(int x, int y, int value) {
        super(x, y, value);
        System.out.println("King(int x, int y, int value)");
    }

    @Override
    public void draw() {
        System.out.println("draw King");
    }

    @Override
    public int getValue() {
        return 0;
    }
}
