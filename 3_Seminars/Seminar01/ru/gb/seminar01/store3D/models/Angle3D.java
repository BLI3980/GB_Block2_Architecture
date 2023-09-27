package ru.gb.seminar01.store3D.models;

import ru.gb.X.store3D.models.Point3D;

import java.util.List;

public class Angle3D {
    private List<ru.gb.X.store3D.models.Point3D> points;

    public Angle3D(List<ru.gb.X.store3D.models.Point3D> points) {
        this.points = points;
    }

    public List<Point3D> getPoints() {
        return points;
    }
}
