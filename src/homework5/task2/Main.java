package homework5.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Иван", 36, "IT", 50000));
        employees.add(new Employee("Олег", 31, "HR", 70000));
        employees.add(new Employee("Владислав", 29, "IT", 30000));
        employees.add(new Employee("Владимир", 26, "HR", 20000));
        employees.add(new Employee("Алексей", 40, "IT", 50000));
        employees.add(new Employee("Наталья", 23, "Buh", 100000));
        employees.add(new Employee("София", 39, "HR", 150000));

        List<Employee> employeesOverThirty = employees.stream()
                .filter(x -> x.getAge() > 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
        System.out.println(employeesOverThirty);

        long countEmployeesInIt = employees.stream()
                .filter(x -> x.getDepartment().equals("IT"))
                .count();
        System.out.println(countEmployeesInIt);

        Employee employeeMaxSalary = employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);
        System.out.println(employeeMaxSalary);

        List<String> nameEmployeesInHr = employees.stream()
                .filter(x -> x.getDepartment().equals("HR"))
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .toList();
        System.out.println(nameEmployeesInHr);

        double averageSalary = employees.stream()
                .mapToInt(Employee::getSalary).average().getAsDouble();
        System.out.println(averageSalary);
    }
}
