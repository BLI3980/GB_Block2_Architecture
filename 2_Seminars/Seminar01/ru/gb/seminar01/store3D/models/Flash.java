package ru.gb.seminar01.store3D.models;

import java.awt.*;

public class Flash implements IModel {
    private ru.gb.seminar01.store3D.models.Point3D location;
    private ru.gb.seminar01.store3D.models.Angle3D angle;
    private Color color;
    private float power;

    public Flash() {
    }

    public Flash(ru.gb.seminar01.store3D.models.Point3D location, ru.gb.seminar01.store3D.models.Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Flash(ru.gb.seminar01.store3D.models.Point3D location, ru.gb.seminar01.store3D.models.Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        //TODO: method to be developed.
    }

    public void move(Point3D point) {
        //TODO: method to be developed.
    }

    @Override
    public String getInfo() {
        return "Flash";
    }
}
