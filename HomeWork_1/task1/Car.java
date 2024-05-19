package task1;

class Car {

    // Поля класса
    String brand;
    String model;
    int year;

    // Конструктор
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Метод для вывода информации о машине
    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Год производства: " + year);
    }
}
