package ru.gb.X.store3D.models;

public class Scene implements IModel {
    private int counter = 1000;
    private int id;
    private PolygonalModel polygon;
    private ru.gb.X.store3D.models.Flash flash;
    private ru.gb.X.store3D.models.Camera camera;

    {
        id = ++counter;
    }


    public Scene(PolygonalModel polygon, ru.gb.X.store3D.models.Flash flash, ru.gb.X.store3D.models.Camera camera) {
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
