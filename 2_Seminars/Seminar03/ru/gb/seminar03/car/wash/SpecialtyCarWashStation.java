package ru.gb.seminar03.car.wash;

import ru.gb.seminar03.car.config.CarType;

public class SpecialtyCarWashStation implements ICarWashStation{
    private CarType carType;
    @Override
    public void carWash() {
        if (!carType.equals(CarType.Specialty)) {
            System.out.println("This car wash is only for specialty cars.");
        } else {
            System.out.println("Washing the car.");
        }
    }
}
