package ru.gb.seminar03.car.cars;

import java.awt.*;

public class FlyCar extends Car {

    public FlyCar(String brand, String model, Color color) {
        super(brand, model, color);
        setWheelCount(4);
    }

    public void fly() {
        System.out.println("Car flies.");
    }

    @Override
    public void movement() {
        fly();
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
