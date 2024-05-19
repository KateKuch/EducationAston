package task4;

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

    // Перегруженные методы
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear);
    }

    public void displayInfo(String prefix, String suffix) {
        System.out.println(prefix + "Название: " + title + ", Автор: " + author + ", Год публикации: " + publicationYear + " " + suffix);
    }

}
