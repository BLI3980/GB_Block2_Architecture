package ru.gb.homework03.car.fuel;

import ru.gb.homework03.car.config.FuelType;

public class DieselStation implements IFuelStation {
    @Override
    public void refuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel -> System.out.println("Refill a car with diesel.");
            case Gasoline -> System.out.println("Refill a car with gasoline.");
            default -> System.out.println("Unsupported fuel type.");
        }

    }
}
