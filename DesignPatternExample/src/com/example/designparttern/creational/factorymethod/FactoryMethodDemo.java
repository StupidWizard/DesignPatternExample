package com.example.designparttern.creational.factorymethod;

import com.example.designparttern.creational.factorymethod.shape.Shape;
import com.example.designparttern.creational.factorymethod.shape.ShapeType;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}
