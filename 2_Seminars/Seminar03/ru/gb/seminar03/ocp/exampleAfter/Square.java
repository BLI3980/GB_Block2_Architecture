package ru.gb.seminar03.ocp.exampleAfter;

public class Square implements Shape {
    private final int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
