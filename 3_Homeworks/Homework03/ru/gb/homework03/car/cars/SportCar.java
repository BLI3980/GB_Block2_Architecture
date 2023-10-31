package ru.gb.homework03.car.cars;

import ru.gb.homework03.car.config.CarType;
import ru.gb.homework03.car.wash.CarWashStation;
import ru.gb.homework03.car.wash.ICarWashStation;

import java.awt.*;

public class SportCar extends Car implements ICarWashStation {
    private CarWashStation carWashStation;
    public SportCar(String brand, String model, Color color) {
        super(brand, model, color);
        setWheelCount(3);
        setType(CarType.Sport);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void setCarWashStation(CarWashStation carWashStation) {
        this.carWashStation = carWashStation;
        carWashStation.setCarType(getType());
    }
    @Override
    public void carWash() {
        carWashStation.carWash();
    }
}
