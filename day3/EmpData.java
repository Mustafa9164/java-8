package day3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpData {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 70000, "HR"),
                new Employee(2, "Bob", 80000, "Finance"),
                new Employee(3, "Charlie", 90000, "IT"),
                new Employee(4, "David", 75000, "IT")

        );

        Map<String, List<Employee>> empByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        empByDept.forEach((k,v)->{
            System.out.println(k +"-> "+ v.size());
        });



    }
}
