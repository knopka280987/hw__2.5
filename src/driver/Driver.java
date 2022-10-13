package driver;

import transport.Transport;

public abstract class Driver<D extends Transport> {
    private final String name;
    private static String driversLicense;
    private Double drivingExperience;

    public Driver(String name, String driversLicense, Double drivingExperience) {
        this.name = name;
        setDriversLicense(driversLicense);
        setDrivingExperience(drivingExperience);
    }

    public String getName() {
        return name;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) {
        if (driversLicense == null || driversLicense.isBlank()){
            Driver.driversLicense = "Права отсутствуют";
        } else {
            Driver.driversLicense = driversLicense;
        }
    }

    public Double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Double drivingExperience) {
        this.drivingExperience = drivingExperience <= 0 ? Double.valueOf("Без стажа вождения") : drivingExperience;
    }

    public abstract void startMove(D transport);

    public abstract void stopMove(D transport);

    public abstract void refill(D transport);

    @Override
    public String toString() {
        return "Водитель " + name + ", категория прав: " + driversLicense + ", стаж вождения: " + drivingExperience + " лет.";
    }
}
