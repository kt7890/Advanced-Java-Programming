import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Rahul", 50000));
        list.add(new Employee("Amit", 70000));
        list.add(new Employee("Neha", 80000));
        list.add(new Employee("Riya", 40000));

        List<String> result = list.stream()
                .filter(e -> e.salary > 60000)    
                .map(e -> e.name.toUpperCase())   
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}