package com.example.designparttern.creational.factorymethod;

import com.example.designparttern.creational.factorymethod.shape.*;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            default:    // square
                return new Square();
        }
    }
}
