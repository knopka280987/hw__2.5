package transport;

import com.sun.jdi.connect.Transport;

public class Truck implements Competing, Transport {

    public Truck(String brand, String model, Double engineVolume) {
        super();
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение с грузом");
    }
    @Override
    public void finishMoving() {
        System.out.println("Грузовик привез груз в пункт назначения");
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " остановился поменять колесо");
    }

    private String getBrand() {
        return null;
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " показал лучшую скорость");
    }
    @Override
    public void bestTime() {
        System.out.println("Грузовик " + getBrand() + " приехал первым");
    }

    @Override
    public String name() {
        return null;
    }
}