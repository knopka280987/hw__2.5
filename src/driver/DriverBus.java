package driver;

import transport.Bus;

public class DriverBus extends Driver <Bus>{
    public DriverBus(String name,  Double drivingExperience) {
        super(name, "D", drivingExperience);
    }

    @Override
    public void startMove(Bus transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на автобусе "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Bus transport) {
        System.out.println("Водитель " + getName() + " остановил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getName() + " заправил автобус " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }


}