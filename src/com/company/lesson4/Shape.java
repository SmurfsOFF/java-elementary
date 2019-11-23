package com.company.lesson4;

public  class Shape {
    protected String color;
    private int size;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        this.drawshape();
    }

    public void fill() {
        System.out.println("Fill " + this.color);
    }

    private void drawshape() {
        System.out.println("Draw logic for any shape");
        System.out.println("Play music");
    }
}
