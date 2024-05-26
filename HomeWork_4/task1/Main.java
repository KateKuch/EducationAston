package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //добавляем и выводим объекты
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Россия");
        countries.add("Германия");
        countries.add("Франция");

        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //изменяем элем.  с индексом 2
        countries.set(2, "Великобритания");
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //удаляем элем. с индексом 2
        countries.remove(2);
        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //удаляем люой элем. по значению
        countries.remove("Германия");

        for (String country : countries) {
            System.out.print(country + " ");
        }
        System.out.println();

        //Узнаем индекс любого элемента

        System.out.println("Индекс элемента \"Россия\": " + countries.indexOf("Россия"));

        //проверка на наличие элемента в коллекции

        if (countries.indexOf("Египет") == -1){
            System.out.println("Такого элемента в списке нет.");
        } else {
            System.out.println("Индекс элемента \"Египет\": " + countries.indexOf("Египет"));
        }
    }
}