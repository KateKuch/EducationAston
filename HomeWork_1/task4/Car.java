package task4;

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

    // Перегруженные методы
    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year);
    }

    public void displayInfo(String prefix, String suffix) {
        System.out.println(prefix + "Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year + " " + suffix);
    }

}
