package ru.gb.X.store3D.models;

public class Camera implements IModel{
    private Point3D location;
    private Angle3D angle;

    public Camera() {
    }

    public Camera(Point3D location, Angle3D angle) {
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
