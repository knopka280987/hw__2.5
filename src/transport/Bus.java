package transport;

import com.sun.jdi.connect.Transport;

public class Bus implements Competing, Transport {

    public Bus(String brand, String model, Double engineVolume) {
        super();
    }
    @Override
    public void startMoving() {
        System.out.println("Автобус отправился от остановки");
    }
    @Override
    public void finishMoving() {
        System.out.println("Автобус прибыл на конечную остановку");
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился на дозаправку");
    }

    public String getBrand() {
        return null;
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " ехал быстрее всех");
    }
    @Override
    public void bestTime() {
        System.out.println("Автобус " + getBrand() + " проказал лучшее время в заезде");
    }

    @Override
    public String name() {
        return null;
    }

    public String getModel() {
        return null;
    }
}


