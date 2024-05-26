package task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", 101, 1));
        students.add(new Student("Петр", 203, 2));
        students.add(new Student("Анна", 301, 3));

        students.get(0).addGrade("Математика", 4);
        students.get(0).addGrade("Физика", 3);
        students.get(1).addGrade("Математика", 2);
        students.get(1).addGrade("Физика", 5);
        students.get(2).addGrade("Математика", 3);
        students.get(2).addGrade("Физика", 4);

        for (Student student : students) {
            student.processCourse();
        }


        Student.printStudents(students, 2);
    }
}
