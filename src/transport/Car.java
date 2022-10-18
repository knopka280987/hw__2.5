package transport;

import com.sun.jdi.connect.Transport;

public class Car implements Competing, Transport {
    public Car(String brand, String model, Double engineVolume) {
        super();
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль приехал");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " остановился поменять водителя, заправиться");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " имеет лучшую скорость в гонке");
    }

    @Override
    public void bestTime() {
        System.out.println("Автомобиль " + getBrand() + " продемонстрировал лучшее время");
    }

    public String getBrand() {
        return null;
    }



    @Override
    public String name() {
        return null;
    }

    public String getModel() {
        return null;
    }
}