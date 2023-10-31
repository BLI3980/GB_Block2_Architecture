package ru.gb.homework03.car.wash;

import ru.gb.homework03.car.config.CarType;

public class SpecialtyCarWashStation extends CarWashStation {
    private CarType carType;

    @Override
    public void carWash() {
        carWash(carType);
    }

    private void carWash(CarType carType) {
        if (!carType.equals(CarType.Specialty)) {
            System.out.println("This type of car wash is only for spacialty cars.");
        } else {
            System.out.println("Washing the car.");
        }
    }

    public void setCarType(CarType carType) {
        this.carType = carType;

    }
}
