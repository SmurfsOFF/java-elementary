package com.company.lesson4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("black");
        shape.draw();
        shape.fill();

        System.out.println("-------------------");

        Circle circle = new Circle("blue");
        circle.fill();
        circle.draw();

        System.out.println("-------------------");

        Rectangle rectangle = new Rectangle("yellow");
        rectangle.draw();
        rectangle.fill();
    }
}
