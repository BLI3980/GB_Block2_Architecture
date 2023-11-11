package ru.gb.seminar03.task02before;

/**
 * Information about car parts
 */
public class ComponentInfo {
    private int id;
    private String description;

    public ComponentInfo(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("#%d - %s", id, description);
    }
}
