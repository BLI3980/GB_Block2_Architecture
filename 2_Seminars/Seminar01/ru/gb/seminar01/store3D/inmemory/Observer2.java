package ru.gb.seminar01.store3D.inmemory;

public class Observer2 implements IModelChangeObserver {
    @Override
    public void applyUpdateModel() {
        System.out.println("Notification for observer#2.");
    }
}
