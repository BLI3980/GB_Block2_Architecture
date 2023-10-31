package ru.gb.homework03.car.wash;

import ru.gb.homework03.car.config.CarType;

public abstract class CarWashStation {
    private CarType carType;
    public abstract void carWash();

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
