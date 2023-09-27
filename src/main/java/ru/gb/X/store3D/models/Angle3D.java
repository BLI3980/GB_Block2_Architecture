package ru.gb.X.store3D.models;

import java.util.List;

public class Angle3D {
    private List<Point3D> points;

    public Angle3D(List<Point3D> points) {
        this.points = points;
    }

    public List<Point3D> getPoints() {
        return points;
    }
}
