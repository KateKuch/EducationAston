package task1;

public class Truck extends Car {

    //поля
    private int numberOfDoors, trunkCapacity;
    private String fuelType;
    private double maxLoadCapacity;

    //конструктор
    public Truck (int numberOfDoors, int trunkCapacity, String fuelType, double maxLoadCapacity) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    //методы
    public int getNumberOfDoors (){
        return numberOfDoors;
    }
    public int getTrunkCapacity (){
        return trunkCapacity;
    }
    public String getFuelType(){
        return fuelType;
    }
    public double getMaxLoadCapacity(){
        return maxLoadCapacity;
    }

    public void start() {
        System.out.println("Машина начала движение.");
    }

    public void stop() {
        System.out.println("Машина остановилась.");
    }
}
