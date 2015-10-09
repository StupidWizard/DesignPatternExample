package com.example.designparttern.structural.decorator.complexdecorate;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape myShape;

    public ShapeDecorator(Shape pShape) {
        myShape = pShape;
    }

    @Override
    public void draw() {
        myShape.draw();
    }
}
