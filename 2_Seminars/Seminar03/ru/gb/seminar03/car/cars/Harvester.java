package ru.gb.seminar03.car.cars;

import ru.gb.seminar03.car.config.CarType;
import ru.gb.seminar03.car.config.FuelType;
import ru.gb.seminar03.car.wash.ICarWashStation;
import ru.gb.seminar03.car.wash.IWipeService;
import ru.gb.seminar03.car.fuel.IFuelStation;
import ru.gb.seminar03.car.fuel.IRefillWithFuel;

import java.awt.*;

public class Harvester extends Car implements IRefillWithFuel, IWipeService, ICarWashStation {

    private IFuelStation fuelStation;
    private ICarWashStation carWashStation;

    public Harvester(String brand, String model, Color color) {
        super(brand, model, color);
        setWheelCount(6);
        setFuelType(FuelType.Diesel);
        setType(CarType.Specialty);
    }

    // region Fuel
    public void setFuelStation(IFuelStation fuelStation) {
        this.fuelStation = fuelStation;
    }

    @Override
    public void refuel() {
        if (fuelStation != null) fuelStation.refuel(fuelType);
    }
    // endregion
    // region Wash
    public void setCarWashStation(ICarWashStation carWashStation) {
        this.carWashStation = carWashStation;
    }

    @Override
    public void carWash() {
        if (carWashStation != null) {
            carWashStation.carWash();
        }
    }
    // endregion


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

    public void sweeping() {
        System.out.println("Car sweeps a street.");
    }

    @Override
    public void wipeMirrors() {

    }

    @Override
    public void wipeWindShield() {

    }

    @Override
    public void wipeHeadLights() {

    }


}
