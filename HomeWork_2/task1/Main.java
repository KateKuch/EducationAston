package task1;

public class Main {

    public static void main(String[] args){

        //создаем объекты классов
        Sedan sedan = new Sedan(7, 200, "Бензин", "5 звезд");
        Truck truck = new Truck(5, 350, "Дизель", 4000.7);

        //тестируем методы
        System.out.println("Sedan:");
        sedan.start();
        System.out.println("Fuel Type: " + sedan.getFuelType());
        System.out.println("Number of Doors: " + sedan.getNumberOfDoors());
        System.out.println("Trunk Capacity: " + sedan.getTrunkCapacity());
        System.out.println("Luxury Level: " + sedan.getLuxuryLevel());
        sedan.stop();

        System.out.println("Truck:");
        truck.start();
        System.out.println("Fuel Type: " + truck.getFuelType());
        System.out.println("Number of Doors: " + truck.getNumberOfDoors());
        System.out.println("Trunk Capacity: " + truck.getTrunkCapacity());
        System.out.println("Max Load Capacity: " + truck.getMaxLoadCapacity());
        truck.stop();
    }
}
