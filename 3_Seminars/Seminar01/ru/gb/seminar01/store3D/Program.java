package ru.gb.seminar01.store3D;

import ru.gb.seminar01.store3D.inmemory.ModelStore;
import ru.gb.seminar01.store3D.inmemory.Observer1;
import ru.gb.seminar01.store3D.inmemory.Observer2;
import ru.gb.seminar01.store3D.models.PolygonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        ModelStore store = new ModelStore();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        store.registerModelChanger(observer1);
        store.registerModelChanger(observer2);

        ru.gb.seminar01.store3D.models.Polygon polygon = new ru.gb.seminar01.store3D.models.Polygon();
        List<ru.gb.seminar01.store3D.models.Polygon> polygons = new ArrayList<>();
        polygons.add(polygon);

        ru.gb.seminar01.store3D.models.PolygonalModel polygonalModel = new PolygonalModel(polygons);
        store.add(polygonalModel);
        ru.gb.seminar01.store3D.models.Flash flash = new ru.gb.seminar01.store3D.models.Flash();
        store.add(flash);
        ru.gb.seminar01.store3D.models.Camera camera = new ru.gb.seminar01.store3D.models.Camera();
        store.add(camera);
        ru.gb.seminar01.store3D.models.Scene scene = new ru.gb.seminar01.store3D.models.Scene();
        store.add(scene);

    }
}
