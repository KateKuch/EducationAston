package task2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();

        //заполняем по 2 в начало и по 2 в конец
        countries.addFirst("Россия");
        countries.addFirst("Франция");

        countries.addLast("Канада");
        countries.addLast("Китай");

        System.out.println("Список стран:");
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //удаляем по одному эл из начала и из конца
        countries.removeFirst();
        countries.removeLast();

        System.out.println("Список стран:");
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //получаем по одному элементу из начала и из конца списка
        System.out.println("Элемент из начала списка: " + countries.getFirst());
        System.out.println("Элемент из конца списка: " + countries.getLast());
    }
}
