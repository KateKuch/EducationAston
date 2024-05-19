package task3;

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

    // Сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear);
    }

}
