package com.apache.demo.randomdesignpattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class WoodenDoor implements Door{

    private float width;
    private float height;
    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }
}
