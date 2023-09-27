package ru.gb.X.store3D.inmemory;

public class Observer1 implements IModelChangeObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("Notification for observer#1.");
    }
}
