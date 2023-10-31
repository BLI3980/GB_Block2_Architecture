package ru.gb.seminar03.car.fuel;

import ru.gb.seminar03.car.config.FuelType;

public class GasolineStation implements IFuelStation{
    @Override
    public void refuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel -> System.out.println("Refill a car with diesel.");
            case Gasoline -> System.out.println("Refill a car with gasoline.");
        }

    }
}
