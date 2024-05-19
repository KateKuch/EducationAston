package task1;

public class Sedan extends Car {

    //поля
    private int numberOfDoors, trunkCapacity;
    private String fuelType, luxuryLevel;

    //конструктор
    public Sedan (int numberOfDoors, int trunkCapacity, String fuelType, String luxuryLevel) {
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
        this.luxuryLevel = luxuryLevel;
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
    public String getLuxuryLevel(){
        return luxuryLevel;
    }

    public void start() {
        System.out.println("Машина начала движение.");
    }

    public void stop() {
        System.out.println("Машина остановилась.");
    }
}
