package task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private int group;
    private int course;
    private Map<String, Integer> grades; // Хранение оценок по предметам

    // Конструктор для инициализации полей
    public Student(String name, int group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    // Методы
    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public int getGrade(String subject) {
        return grades.getOrDefault(subject, -1); // Если предмет отсутствует, возвращаем -1
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void processCourse() {
        if (getAverageGrade() >= 3) {
            course++;
        } else {
            System.out.println(name + " удален за неудовлетворительные оценки.");
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
