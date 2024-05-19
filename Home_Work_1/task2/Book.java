package task2;

class Book {

    // Поля класса
    String title;
    String author;
    int publicationYear;

    // Статический блок инициализации
    static {
        System.out.println("Статический блок в классе Book выполнен");
    }

    // Не статический блок инициализации
    {
        System.out.println("Не статический блок в классе Book выполнен");
    }

    // Конструктор
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear);
    }

}

