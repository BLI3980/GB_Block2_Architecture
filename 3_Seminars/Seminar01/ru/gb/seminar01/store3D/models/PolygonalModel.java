package ru.gb.seminar01.store3D.models;

import ru.gb.X.store3D.models.IModel;
import ru.gb.X.store3D.models.Polygon;
import ru.gb.X.store3D.models.Texture;

import java.util.List;

public class PolygonalModel implements IModel {
    private List<ru.gb.X.store3D.models.Polygon> polygons;
    private List<ru.gb.X.store3D.models.Texture> textures;

    public PolygonalModel(List<ru.gb.X.store3D.models.Polygon> polygons) {
        this.polygons = polygons;
    }

    public PolygonalModel(List<ru.gb.X.store3D.models.Polygon> polygons, List<ru.gb.X.store3D.models.Texture> textures) {
        this.polygons = polygons;
        this.textures = textures;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    @Override
    public String getInfo() {
        return "Polygonal";
    }
}
