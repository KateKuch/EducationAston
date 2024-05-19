package task3;

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

    // Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод для вывода информации о машине
    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Год выпуска: " + year);
    }

}

