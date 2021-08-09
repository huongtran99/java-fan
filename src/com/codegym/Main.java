package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println("speed: " + fan1.getSpeed());
        System.out.println("radius: " + fan1.getRadius());
        System.out.println("color: " + fan1.getColor());

        Fan fan2 = new Fan(2, false, "blue", 5);
        fan1.toStrings();
        fan2.toStrings();
    }
}
