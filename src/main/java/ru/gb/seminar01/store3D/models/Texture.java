package ru.gb.seminar01.store3D.models;

public class Texture {
    private int id;
    ///<Summary>
    /// Texture name
    ///</Summary>
    private String name;

    public Texture(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
