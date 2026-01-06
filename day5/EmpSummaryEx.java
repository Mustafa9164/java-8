package day5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpSummaryEx {

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 60000)
        );

        Stream<Employee> employeeStream = employees.stream().filter(e -> e.getSalary() >= 60000);
        System.out.println(employeeStream.collect(Collectors.summarizingDouble(Employee::getSalary)));

    }
}
