package akhi.io.eight.multi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {
    public static void main(String[] args) {
        String str = "abcefgabhokokoko";
        List<String> myVal = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println(myVal);
    }
}
