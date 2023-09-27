package ru.gb.X.store3D.inmemory;

public interface IModelChanger {

    /**
     * A change has occurred in the store of models
     */
    void notifyChange();
    void registerModelChanger(IModelChangeObserver o);
    void removeModelChanger(IModelChangeObserver o);
}
