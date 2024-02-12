package com.enigma.oop.day2;

public class Rectangle {
    private int lenght;
    private int height;

    public void rectangle(int lenght, int height){
        this.height = height;
        this.lenght = lenght;
    }

    public int getRound(){
        int round = 2 * (lenght * height);
        return round;
    }
}
