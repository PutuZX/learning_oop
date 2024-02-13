package com.enigma.oop.day2;

public class Square extends Abstract {
    private Double lenght;
    private Double width;

    Square(Double lenght, Double width){
        this.width = width;
        this.lenght = lenght;
    }

    public Square() {System.out.println("Hello Block Constructor!");}

    public Double getArea() {
        return lenght * width;
    }

    public Double getRound(){
        return 2*(lenght+width);
    }
}
