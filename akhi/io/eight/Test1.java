package akhi.io.eight;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
//        String s1 = "akhilesh";
//        String s2 = new String("akhilesh");
//        s2.intern();
//        System.out.println(s1 == s2);

        String input = "welcome to java world";
        Set<Integer> checked = new HashSet<>();
        OptionalInt first = input.chars().filter(i -> !checked.add(i)).findFirst();

        if(first.isPresent()){
            System.out.println((char)first.getAsInt());
        }

        String elements = String.valueOf(Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).findFirst());
        System.out.println(elements);

        Character res = input.chars().mapToObj(i -> Character.toLowerCase(Character.valueOf((char)i))).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(enntry -> enntry.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println(res);

    }
}
