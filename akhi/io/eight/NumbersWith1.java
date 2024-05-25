package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find out all the numbers starting with 1 using Stream functions?
public class NumbersWith1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,19,87,15,43,22,15,67,12,43,123,23);
       // list.stream().map(s->s+ "").filter(s-> s.startsWith("1")).forEach(System.out::println);
        System.out.println(list.stream().map(s -> s+"").filter(s -> s.startsWith("1")).collect(Collectors.toSet()));
    }
}
