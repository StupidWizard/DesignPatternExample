package com.example.designparttern.creational.abstractfactory;

import com.example.designparttern.creational.abstractfactory.color.Color;
import com.example.designparttern.creational.abstractfactory.color.ColorType;
import com.example.designparttern.creational.abstractfactory.shape.Shape;
import com.example.designparttern.creational.abstractfactory.shape.ShapeType;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        if (square != null) {
            square.draw();
        }

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        if (circle != null) {
            circle.draw();
        }

        Shape rectangle = colorFactory.getShape(ShapeType.SQUARE);
        if (rectangle != null) {
            rectangle.draw();
        }

        Color red = colorFactory.getColor(ColorType.RED);
        if (red != null) {
            red.fill();
        }

        Color green = shapeFactory.getColor(ColorType.GREEN);
        if (green != null) {
            green.fill();
        }

        Color blue = colorFactory.getColor(ColorType.BLUE);
        if (blue != null) {
            blue.fill();
        }
    }
}
