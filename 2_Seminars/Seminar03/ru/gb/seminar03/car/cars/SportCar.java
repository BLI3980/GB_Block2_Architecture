package ru.gb.seminar03.car.cars;

import java.awt.*;

public class SportCar extends Car {
    public SportCar(String brand, String model, Color color) {
        super(brand, model, color);
        setWheelCount(3);
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
}
