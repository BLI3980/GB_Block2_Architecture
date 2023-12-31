package ru.gb.seminar01.store3D.models;

public class Scene implements IModel {
    private int counter = 1000;
    private int id;
    private ru.gb.seminar01.store3D.models.PolygonalModel polygon;
    private ru.gb.seminar01.store3D.models.Flash flash;
    private ru.gb.seminar01.store3D.models.Camera camera;

    {
        id = ++counter;
    }


    public Scene(ru.gb.seminar01.store3D.models.PolygonalModel polygon, ru.gb.seminar01.store3D.models.Flash flash, ru.gb.seminar01.store3D.models.Camera camera) {
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
