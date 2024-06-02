package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = createEmployeeList();

        List<Employee> employeesOver30 = sortedByAge(employeeList);
        System.out.println("Сотрудники за 30 отсортированные по возрасту: " + employeesOver30);

        long itDepartmentCount = sumOfDepartmentIT(employeeList);
        System.out.println("Число работников в IT-отделе: " + itDepartmentCount);

        Optional<Employee> highestPaidEmployee = employeeWithMaxSalary(employeeList);
        highestPaidEmployee.ifPresent(employee -> System.out.println("Сотрудник с самой высокой зарплатой: " + employee));

        List<String> hrEmployeeNames = listOfHR(employeeList);
        System.out.println("HR сотрудники отсортированные по имени: " + hrEmployeeNames);

        double averageSalary = averageSalary(employeeList);
        System.out.println("Средняя зарплата: " + averageSalary);
    }

    public static List<Employee> createEmployeeList (){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 24, "IT", 60000));
        employees.add(new Employee("Петр", 35, "HR", 50000));
        employees.add(new Employee("Александра", 32, "IT", 70000));
        employees.add(new Employee("Евгения", 45, "Финансовый", 80000));
        employees.add(new Employee("Максим", 29, "IT", 75000));
        employees.add(new Employee("Юрий", 28, "HR", 55000));
        employees.add(new Employee("Дмитрий", 40, "IT", 90000));
        employees.add(new Employee("Виктор", 30, "Финансовый", 95000));
        return employees;
    }

    public static List<Employee> sortedByAge (List<Employee> list){
        return list.stream()
                .filter( n -> n.getAge() > 30 )
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
    }

    public static int sumOfDepartmentIT (List<Employee> list){
        return (int) list.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .count();
    }

    public static Optional<Employee> employeeWithMaxSalary (List<Employee> list){
        return list.stream()
                .max(Comparator.comparingDouble(Employee :: getSalary));
    }

    public static List<String> listOfHR (List<Employee> list){
        return list.stream()
                .filter(n -> n.getDepartment().equals("HR"))
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public static double averageSalary (List<Employee> list){
        return list.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }
}
