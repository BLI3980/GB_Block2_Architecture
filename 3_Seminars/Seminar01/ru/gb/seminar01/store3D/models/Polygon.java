package ru.gb.seminar01.store3D.models;

import java.util.List;

public class Polygon {
    private List<ru.gb.seminar01.store3D.models.Point3D> points;

    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    public Polygon() {
    }
}
