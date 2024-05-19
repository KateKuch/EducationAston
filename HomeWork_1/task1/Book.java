package task1;

class Book {

    // Поля класса
    String title;
    String author;
    int publicationYear;

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
