package akhi.io.hundred;


import akhi.io.eight.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {
    public static <R> void main(String[] args) {
        List<Employee> empList = Stream.of(
                new Employee("akhi",30,50000),
                new Employee("Raj",40,42400),
                new Employee("Manish",20,5000),
                new Employee("ansh",30,40000),
                new Employee("akhi",30,60000)
                ).collect(Collectors.toList());
       // System.out.println(empList);

        //from this employeelist find just emp name and salary
        List<String> employeesName = empList.stream().map(Employee::getName).collect(Collectors.toList());
        empList.stream().collect(Collectors.groupingBy(Employee::getName));

        Comparator<Employee> comparingSalary = Comparator.comparing(Employee::getSalary);
        System.out.println("comparingSalary : "+comparingSalary);
        // System.out.println(employeesName);

        List<Integer> intList = Arrays.asList(2,1,3,5,343,23,32,3,55,3,5,4);
     //   intList.stream().filter(t-> t>4).sorted().forEach(System.out::println);

        //count of each char in String
        String input = "akhilesh";
        Map<String, Long> count = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), counting()));
        count.entrySet().forEach(System.out::println);


        IntStream.rangeClosed(1,10).forEach(t-> System.out.println(Thread.currentThread().getName()+t));

        System.out.println("========================");

        IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread().getName()+" : "+t));

    }
}
