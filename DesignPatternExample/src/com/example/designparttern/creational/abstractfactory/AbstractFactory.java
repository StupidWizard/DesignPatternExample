package com.example.designparttern.creational.abstractfactory;

import com.example.designparttern.creational.abstractfactory.color.Color;
import com.example.designparttern.creational.abstractfactory.color.ColorType;
import com.example.designparttern.creational.abstractfactory.shape.Shape;
import com.example.designparttern.creational.abstractfactory.shape.ShapeType;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public abstract class AbstractFactory {

    abstract Shape getShape(ShapeType shapeType);

    abstract Color getColor(ColorType colorType);
}
