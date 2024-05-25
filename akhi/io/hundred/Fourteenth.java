package akhi.io.hundred;

import akhi.io.eight.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fourteenth {
    public static void main(String[] args) {
        List<Employee>  employeeList= Arrays.asList(
                new Employee("akhi", 30, 10000),
                new Employee("manish", 32, 10000),
                new Employee("deepak", 34, 10000),
                new Employee("sam", 31, 10000)
        );

        Stream<Employee> sorted = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed());
        List<String> sortedNameList = employeeList.stream().map(e -> e.getName()).sorted().collect(Collectors.toList());
        System.out.println(sortedNameList);

        List<String> stringList = Arrays.asList("1","2","4","8","5");
        List<Integer> sortedStringList = stringList.stream().map(Integer::valueOf).sorted().collect(Collectors.toList());
        System.out.println(sortedStringList);

    }
}
