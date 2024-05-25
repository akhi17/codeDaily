package akhi.io.eight;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestOne {
    public static void main(String[] args) {
        String s = "hi my name is akhilesh";
        String str = s.replace(" ", "").toUpperCase();
        Map<String, Long> eachCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(eachCount);
        Map<Integer, Long> collect = (Map<Integer, Long>) str.chars().mapToObj(c -> Character.valueOf((char) c)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
