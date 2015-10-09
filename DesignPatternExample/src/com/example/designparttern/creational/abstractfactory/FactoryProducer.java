package com.example.designparttern.creational.abstractfactory;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String name) {
        if (name.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        else if (name.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        System.out.println("incorrect name");
        return null;
    }
}
