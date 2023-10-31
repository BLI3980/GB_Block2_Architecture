package ru.gb.seminar03.car.wash;

import ru.gb.seminar03.car.config.CarType;

public class ContactlessCarWash implements ICarWashStation{
    private CarType carType;
    @Override
    public void carWash() {
        carWash(carType);
//        if (carType.equals(CarType.Specialty)) {
//            System.out.println("Cannot wash this type of cars on this wash station.");
//        } else {
//            System.out.println("Washing the car.");
//        }
    }

    public void carWash(CarType carType) {
        if (carType.equals(CarType.Specialty)) {
            System.out.println("Cannot wash this type of cars on this wash station.");
        } else {
            System.out.println("Washing the car.");
        }
    }

    public void setCarType(CarType carType) {
        this.carType = carType;

    }
}
