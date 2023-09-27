package ru.gb.X.store3D.inmemory;

import ru.gb.X.store3D.models.Camera;
import ru.gb.X.store3D.models.Flash;
import ru.gb.X.store3D.models.PolygonalModel;
import ru.gb.X.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<IModelChangeObserver> observers = new ArrayList<>();
    private List<PolygonalModel> polygonals = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();

    public void add(PolygonalModel model) {
        polygonals.add(model);
        System.out.println("New model added to model store - " + model.getInfo());
        notifyChange();
    }
    public void add(Flash model) {
        flashes.add(model);
        System.out.println("New model added to model store - " + model.getInfo());
        notifyChange();
    }
    public void add(Camera model) {
        cameras.add(model);
        System.out.println("New model added to model store - " + model.getInfo());
        notifyChange();
    }

    public void add(Scene model) {
        scenes.add(model);
        System.out.println("New model added to model store - " + model.getInfo());
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangeObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangeObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(IModelChangeObserver o) {
        observers.remove(o);
    }
}
