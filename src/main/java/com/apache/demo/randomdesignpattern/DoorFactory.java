package com.apache.demo.randomdesignpattern;

public class DoorFactory {

    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
