package com.example.designparttern.creational.abstractfactory;

import com.example.designparttern.creational.abstractfactory.color.*;
import com.example.designparttern.creational.abstractfactory.shape.Shape;
import com.example.designparttern.creational.abstractfactory.shape.ShapeType;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(ShapeType shapeType) {
        System.out.println("Color factory can not create shape " + shapeType.name());
        return null;
    }

    @Override
    Color getColor(ColorType colorType) {
        switch (colorType) {
            case RED:
                return new Red();

            case GREEN:
                return new Green();

            default:    // blue
                return new Blue();
        }
    }

}
