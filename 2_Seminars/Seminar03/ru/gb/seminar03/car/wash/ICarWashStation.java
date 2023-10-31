package ru.gb.seminar03.car.wash;

import ru.gb.seminar03.car.config.CarType;

public interface ICarWashStation {
    CarType carType = null;
    void carWash();
}
