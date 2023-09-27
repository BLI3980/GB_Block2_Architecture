package ru.gb.seminar01.store3D.models;

import ru.gb.X.store3D.models.Camera;
import ru.gb.X.store3D.models.Flash;
import ru.gb.X.store3D.models.IModel;
import ru.gb.X.store3D.models.PolygonalModel;

public class Scene implements IModel {
    private int counter = 1000;
    private int id;
    private ru.gb.X.store3D.models.PolygonalModel polygon;
    private ru.gb.X.store3D.models.Flash flash;
    private ru.gb.X.store3D.models.Camera camera;

    {
        id = ++counter;
    }


    public Scene(ru.gb.X.store3D.models.PolygonalModel polygon, ru.gb.X.store3D.models.Flash flash, ru.gb.X.store3D.models.Camera camera) {
        this.polygon = polygon;
        this.flash = flash;
        this.camera = camera;
    }

    public Scene() {
    }

    public PolygonalModel getPolygon() {
        return polygon;
    }

    public Flash getFlash() {
        return flash;
    }

    public Camera getCamera() {
        return camera;
    }

    @Override
    public String getInfo() {
        return "Scene";
    }
}
