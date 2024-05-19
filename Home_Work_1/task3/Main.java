package task3;

public class Main {
    public static void main(String[] args) {
        // Установка значений через конструктор
        Book book1 = new Book("1984", "Джордж Оруэлл", 1949);
        book1.displayInfo();

        // Установка значений через сеттеры
        Book book2 = new Book("", "", 0);
        book2.setTitle("О дивный новый мир");
        book2.setAuthor("Олдос Хаксли");
        book2.setPublicationYear(1932);
        book2.displayInfo();

        // Непосредственное присваивание значений полям
        Book book3 = new Book("", "", 0);
        book3.title = "451 градус по Фаренгейту";
        book3.author = "Рэй Брэдбери";
        book3.publicationYear = 1953;
        book3.displayInfo();

        // Установка значений через конструктор
        Car car1 = new Car("Toyota", "Corolla", 2020);
        car1.displayInfo();

        // Установка значений через сеттеры
        Car car2 = new Car("", "", 0);
        car2.setBrand("Honda");
        car2.setModel("Civic");
        car2.setYear(2019);
        car2.displayInfo();

        // Непосредственное присваивание значений полям
        Car car3 = new Car("", "", 0);
        car3.brand = "Ford";
        car3.model = "Mustang";
        car3.year = 2018;
        car3.displayInfo();
    }
}
