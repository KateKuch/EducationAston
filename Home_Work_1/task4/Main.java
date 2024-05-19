package task4;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("1984", "Джордж Оруэлл", 1949);
        book.displayInfo();
        book.displayInfo("Информация:");
        book.displayInfo("Информация:", "Благодарим за прочтение!");

        Car car = new Car("Toyota", "Corolla", 2020);
        car.displayInfo();
        car.displayInfo("Транстпорт:");
        car.displayInfo("Транстпорт:", "доступен.");

    }

}
