package com.example.designparttern.structural.decorator;

import com.example.designparttern.structural.decorator.complexdecorate.Circle;
import com.example.designparttern.structural.decorator.complexdecorate.Rect;
import com.example.designparttern.structural.decorator.complexdecorate.Shape;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class DecoratorDemo {

    public static void main(String[] args) {

        // we have Circle and Rect and many other shapes. all of them can draw shape
        // but NOW, on Draw method, we want to draw border (or any thing) for Circle and Rect
        // -> Decorate circle and rect to a Class which we can control draw method. -> we create ShapeDecorator

        // and then, we can create a class to draw border for shape -> ShapeVsBorderDecorator do it.

        System.out.println("for circle");
        Shape circle = new Circle();
        circle.draw();

        System.out.println("\nfor Rect");
        Shape rect = new Rect();
        rect.draw();

        System.out.println("\nfor circle was Decorator vs Border");
        Shape circleVsBorder = new ShapeVsBorderDecorator(new Circle());
        circleVsBorder.draw();

        System.out.println("\nfor Rect was Decorator vs Border");
        Shape rectVsBorder = new ShapeVsBorderDecorator(new Rect());
        rectVsBorder.draw();



        // other: if we want to draw Bound of shape, we can create class ShapeVsBoundDecorator to do it.
    }
}
