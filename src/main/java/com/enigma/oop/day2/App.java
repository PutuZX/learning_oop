package com.enigma.oop.day2;

public class App extends Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.0, 5.0);
        Square s = new Square(4.0,5.0);
        System.out.println(r.getRound());
        System.out.println(r.getArea());
        System.out.println(s.getArea());
    }
}
