package task2;

class Car {

    // Поля класса
    String brand;
    String model;
    int year;

    // Статический блок инициализации
    static {
        System.out.println("Статический блок в классе Car выполнен");
    }

    // Не статический блок инициализации
    {
        System.out.println("Не статический блок в классе Car выполнен");
    }

    // Конструктор
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Метод для вывода информации о машине
    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year);
    }

}