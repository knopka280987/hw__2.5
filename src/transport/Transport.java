public abstract class Transport {
    private final String brand;
    private final String model;
    private Double engineVolume;
    public Transport(String brand, String model, Double engineVolume) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);}
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }
    public abstract void startMoving();
    public abstract void finishMoving();
    public void infoOfVehicle() {
        System.out.println("Информация о транспортном средстве:");
    }
    @Override
    public String toString() {
        return "Транспортное средство {" +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя='" + engineVolume + '\'' +
                '}';
    }
}