import driver.DriverBus;
import driver.DriverCar;
import driver.DriverTruck;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Truck ural = new Truck("URAL", "Y-4", 3.0);
        Truck gaz = new Truck("GAZ", "G-6", 3.0);

        DriverCar ivan = new DriverCar("Иван", 1.0);
        DriverTruck igor = new DriverTruck("Игорь", 15.0);
        DriverBus vova = new DriverBus("Вова", 7.5);

        Car audi = null;
        System.out.println(audi);
        audi.bestTime();
        Car bmw = null;
        System.out.println(bmw);
        gaz.maxSpeed();
        Truck zil = null;
        System.out.println(zil);
        zil.startMoving();
        System.out.println();

        ivan.startMove(audi);
        Car lada = null;
        ivan.refill(lada);
        ivan.stopMove(bmw);
        System.out.println(ivan);
        System.out.println();

        igor.startMove(zil);
        igor.stopMove(gaz);
        Truck kamaz = null;
        igor.refill(kamaz);
        System.out.println(igor);
        System.out.println();

        Object cityBus = null;
        vova.startMove(cityBus);
        Object touristBus = null;
        vova.stopMove(touristBus);
        Object workBus = null;
        vova.refill(workBus);
        System.out.println(vova);

    }
}
