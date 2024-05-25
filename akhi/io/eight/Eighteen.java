package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Eighteen {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("abc", 34, 23000.0),
                new Employee("abc", 34, 23000.0),
                new Employee("bbc", 35, 27000.0)
        );

       Set<Employee> uniqueEmp =  empList.stream().collect(Collectors.toSet());
        System.out.println(uniqueEmp);
    }
}

