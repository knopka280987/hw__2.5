package driver;

import transport.Truck;

public class DriverTruck extends Driver <Truck>{
    public DriverTruck(String name, Double drivingExperience) {
        super(name, "C", drivingExperience);
    }


    @Override
    public void startMove(Truck transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Truck transport) {
        System.out.println("Водитель " + getName() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }
}