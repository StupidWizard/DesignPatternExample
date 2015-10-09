package com.example.designparttern.structural.decorator;

import com.example.designparttern.structural.decorator.complexdecorate.Shape;
import com.example.designparttern.structural.decorator.complexdecorate.ShapeDecorator;

/**
 * This stupid code is created by thantieuhodo on 10/9/15.
 */
public class ShapeVsBorderDecorator extends ShapeDecorator {

    public ShapeVsBorderDecorator(Shape pShape) {
        super(pShape);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Draw border for shape");
    }
}
