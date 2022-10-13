package driver;

import transport.Car;

public class DriverCar extends Driver<Car> {

    public DriverCar(String name, Double drivingExperience) {
        super(name, "B", drivingExperience);
    }


    @Override
    public void startMove(Car transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на автомобиле "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Car transport) {
        System.out.println("Водитель " + getName() + " остановился на автомобиле " + transport.getBrand() + " "
                + transport.getModel() + ".");
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getName() + " заправил автомобиль " + transport.getBrand() + " "
                + transport.getModel() + ".");
    }
}
