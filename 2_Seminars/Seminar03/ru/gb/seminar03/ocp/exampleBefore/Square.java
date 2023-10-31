package ru.gb.seminar03.ocp.exampleBefore;

public class Square implements Shape{
    private final int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }
}
