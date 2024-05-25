package akhi.io.sorting;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        String input = "akhilesh sharma";
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      //  System.out.println(collect);

        List<Integer> myList = Arrays.asList(11,12,12,11,13,15,14,14,15,45,42,46,32,54,45);
        Set<Integer> set = new HashSet<>();
       // myList.stream().filter(n-> !set.add(n)).forEach(System.out::println);
        //List<Integer> duplicates = myList.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        List<Integer> withoutduplicates = myList.stream().filter(n -> set.add(n)).collect(Collectors.toList());
      //  System.out.println(duplicates);
        System.out.println(withoutduplicates);
    }
}
