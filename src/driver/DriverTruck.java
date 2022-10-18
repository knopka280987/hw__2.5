package driver;

import com.sun.jdi.connect.Transport;

public class DriverTruck<Truck extends Transport> extends Driver <Truck>{
    public DriverTruck(String name, Double drivingExperience) {
        super(name, "C", drivingExperience);
    }


    @Override
    public void startMove(Truck transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на грузовике "
                + transport.name() + " " + transport.name() + ".");
    }

    @Override
    public void stopMove(Truck transport) {
        System.out.println("Водитель " + getName() + " приехал на грузовике " + transport.name() + " "
                + transport.name() + "." );
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправил грузовик " + transport.name() + " "
                + transport.name() + "." );
    }
}