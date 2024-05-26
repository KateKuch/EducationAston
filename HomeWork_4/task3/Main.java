package task3;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person("Иван", 22));
        persons.add(new Person("Петр", 43));
        persons.add(new Person("Анна", 17));

        System.out.println("Список людей:");
        for (Person person : persons) {
            System.out.println(person);
        }

        Iterator<Person> iteratorPersons = persons.iterator();
        while (iteratorPersons.hasNext()){
            Person dellPerson = iteratorPersons.next();
            if (dellPerson.getName().equals("Петр")){
                iteratorPersons.remove();
            } else if (dellPerson.getName().equals("Иван")){
                iteratorPersons.remove();
            }
        }

        System.out.println("Список людей:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
