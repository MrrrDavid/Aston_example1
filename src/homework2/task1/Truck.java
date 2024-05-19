package homework2.task1;


public class Truck extends Car {
    private int numberOfDoors;
    private int trunkCapacity;
    private String fuelType;
    private int maxLoadCapacity;

    public Truck() {
    }

    public Truck(int numberOfDoors, String fuelType, int trunkCapacity, int maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
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
        System.out.println("Стоп");

    }

    @Override
    public void stop() {
        System.out.println("Старт");
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
