package ru.gb.seminar03.car.cars;

import ru.gb.seminar03.car.config.CarType;
import ru.gb.seminar03.car.config.FuelType;
import ru.gb.seminar03.car.config.GearboxType;

import java.awt.*;

public abstract class Car {

    // region Constructors

    public Car(String brand, String model, Color color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // endregion

    // region Public Methods
    public abstract void movement();
    public abstract void maintenance();
    public abstract boolean gearShifting();
    public abstract boolean switchHeadLights();
    public abstract boolean switchWipers();

    // SRP principle:
    // Breaking SRP rule here as class in this case should not be responsible for specific operations
//    public abstract void sweeping();

    // OCP principle:
    // Right way in this case, when new functionality is added to an abstract class of existing application, is
    // to create non-abstract class. Because when creating new abstract method in existing class, we need to implement
    // this method is ALL inherited classes. Rather correct way is to create non-abstract method and, if needed, to
    // overload the method in an inherited class.
    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }



    // endregion

    // region Private Fields
    private String brand;
    private String model;
    private Color color;
    protected CarType type;
    private int wheelCount;
    protected FuelType fuelType;
    private GearboxType gearboxType;
    private double engineCapacity;
    private boolean fogLights = false;
    // endregion

    // region Getters and Setters
    protected void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public CarType getType() {
        return type;
    }

    protected void setType(CarType type) {
        this.type = type;
    }
    //endregion
}
