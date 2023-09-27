package ru.gb.seminar01.store3D.inmemory;

import ru.gb.X.store3D.inmemory.IModelChangeObserver;

public class Observer1 implements IModelChangeObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Notification for observer#1.");
    }
}
