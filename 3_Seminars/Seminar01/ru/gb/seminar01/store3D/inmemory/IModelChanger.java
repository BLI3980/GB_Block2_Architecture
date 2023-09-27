package ru.gb.seminar01.store3D.inmemory;

import ru.gb.X.store3D.inmemory.IModelChangeObserver;

public interface IModelChanger {

    /**
     * A change has occurred in the store of models
     */
    void notifyChange();
    void registerModelChanger(ru.gb.X.store3D.inmemory.IModelChangeObserver o);
    void removeModelChanger(IModelChangeObserver o);
}
