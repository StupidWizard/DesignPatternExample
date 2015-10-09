package com.example.designparttern.creational.abstractfactory;

import com.example.designparttern.creational.abstractfactory.color.Color;
import com.example.designparttern.creational.abstractfactory.color.ColorType;
import com.example.designparttern.creational.abstractfactory.shape.*;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class ShapeFactory extends  AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();

            case RECTANGLE:
                return new Rectangle();

            default:    // square
                return new Square();
        }
    }

    @Override
    Color getColor(ColorType colorType) {
        System.out.println("Shape factory can not create color " + colorType.name());
        return null;
    }
}
