package ru.gb.seminar01.store3D.models;

import ru.gb.X.store3D.models.Angle3D;
import ru.gb.X.store3D.models.IModel;
import ru.gb.X.store3D.models.Point3D;

public class Camera implements IModel {
    private ru.gb.X.store3D.models.Point3D location;
    private ru.gb.X.store3D.models.Angle3D angle;

    public Camera() {
    }

    public Camera(ru.gb.X.store3D.models.Point3D location, ru.gb.X.store3D.models.Angle3D angle) {
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
