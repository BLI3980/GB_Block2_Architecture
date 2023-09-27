package ru.gb.seminar01.store3D.models;

public class Camera implements IModel {
    private ru.gb.seminar01.store3D.models.Point3D location;
    private ru.gb.seminar01.store3D.models.Angle3D angle;

    public Camera() {
    }

    public Camera(ru.gb.seminar01.store3D.models.Point3D location, ru.gb.seminar01.store3D.models.Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {
        //TODO: method to be developed.
    }

    public void move(Point3D point) {
        //TODO: method to be developed.
    }

    @Override
    public String getInfo() {
        return "Camera";
    }
}
