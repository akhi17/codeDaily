package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("akhi","paplu","one","two","pens","three");
       // System.out.println(cities);

        String commaSeparated = String.join("," , cities);
        System.out.println("commaSeparated: "+commaSeparated);

        String commaSeparated1 = cities.stream().collect(Collectors.joining(","));
        System.out.println("commaSeparated1: "+commaSeparated1);

        System.out.println("result after sorting:");
        cities.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
