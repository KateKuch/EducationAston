package task2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // Testing ImmutablePerson
        ImmutablePerson immutablePerson = new ImmutablePerson("Яна", 30, Arrays.asList("Читать", "Плавать в бассеине"));
        System.out.println("ImmutablePerson Name: " + immutablePerson.getName());
        System.out.println("ImmutablePerson Age: " + immutablePerson.getAge());
        System.out.println("ImmutablePerson Hobbies: " + immutablePerson.getHobbies());

        // Testing MutablePerson
        MutablePerson mutablePerson = new MutablePerson("Макс", 25, Arrays.asList("Рисовать", "Программировать"));
        System.out.println("\nMutablePerson Name: " + mutablePerson.getName());
        System.out.println("MutablePerson Age: " + mutablePerson.getAge());
        System.out.println("MutablePerson Hobbies: " + mutablePerson.getHobbies());

        // Modifying MutablePerson
        mutablePerson.setName("Максим");
        mutablePerson.setAge(26);
        mutablePerson.setHobbies(Arrays.asList("Играть в хоккей", "Танцевать"));
        System.out.println("\nИзмененное MutablePerson Name: " + mutablePerson.getName());
        System.out.println("Измененное MutablePerson Age: " + mutablePerson.getAge());
        System.out.println("Измененное MutablePerson Hobbies: " + mutablePerson.getHobbies());
    }
}
