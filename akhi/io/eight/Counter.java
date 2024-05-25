package akhi.io.eight;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter {
    public static void main(String[] args) {
        String str= "Communication";
        LinkedHashMap<String, Long> countOfOccurance = Arrays.stream(str.split("")).map(String::toLowerCase).
                collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println(countOfOccurance);
    }
}
