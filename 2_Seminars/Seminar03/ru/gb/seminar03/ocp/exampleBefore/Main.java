package ru.gb.seminar03.ocp.exampleBefore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));

        double sumArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += (triangle.getLeg1() * triangle.getLeg2()) / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }
            if (shape instanceof Circle) {
                Circle circle= (Circle) shape;
                sumArea += Math.PI * Math.pow(circle.getRadius(),2);
            }
        }
        System.out.println("The sum of areas of all shapes is " + sumArea);
    }
}
