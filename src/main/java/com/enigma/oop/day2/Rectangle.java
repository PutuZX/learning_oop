package com.enigma.oop.day2;

public class Rectangle extends Abstract {
    private Double lenght;
    private Double width;

    Rectangle(Double lenght, Double width){
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle() {System.out.println("Hello Rectangle Constructor!");}

    public Double getArea() {
        return lenght * width;
    }

    public Double getRound(){
        return 2*(lenght+width);
    }
}
