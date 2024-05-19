package homework2.task1;

public class Sedan extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private String fuelType;
    private String luxuryLevel;

    public Sedan() {

    }

    public Sedan(String luxuryLevel, String fuelType, int numberOfDoors, int trunkCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.luxuryLevel = luxuryLevel;
    }

    public String getLuxuryLevel() {
        return luxuryLevel;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Старт");
    }

    @Override
    public void stop() {
        System.out.println("Стоп");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
