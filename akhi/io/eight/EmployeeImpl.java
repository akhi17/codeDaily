package akhi.io.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("akhi", 23, 5000),
                new Employee("Clex", 29, 6000),
                new Employee("Josh", 21, 9000),
                new Employee("Merc", 20, 4000));

        System.out.println(empList);

        List<Employee> incrementedList = empList.stream().map(e -> {
            if (e.getAge() < 25) {
                e.setSalary(e.getSalary() * 2);
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(incrementedList);

    }
}
