package com.musaib.oop.abstraction;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 10;

    void calculateArea() {
        System.out.println("Area of Circle = " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 11;
    int width = 5;

    void calculateArea() {
        System.out.println("Area of Rectangle = " +
                (length * width));
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s2.calculateArea();
    }
}