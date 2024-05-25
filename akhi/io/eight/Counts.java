package akhi.io.eight;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Counts {

    public static void main(String[] args) {
        String num = "akhilesh";
        Integer number = 7986;
        Map<String, Long> result = Arrays.stream(num.split("")).
                collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);
    }
}

