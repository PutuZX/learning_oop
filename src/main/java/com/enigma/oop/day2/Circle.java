package com.enigma.oop.day2;

public class Circle {
    private double pi = 3.14;
    private int radius;

    Circle(double pi, int radius){
        this.pi = pi;
        this.radius = radius;
    }

    public Circle() {System.out.println("Hello Block Constructor!");}

    public Double getArea() {
        return pi * (radius*radius);
    }

    public Double getRound(){
        return 2*pi*radius;
    }
}
