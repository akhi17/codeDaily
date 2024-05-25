package akhi.io.misc;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dupes {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,6,4,3,2,23,2,2,1,131,3,3,43,54,6,5,3,1,3,56,4);
        Map<Integer, Long> output = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        output.forEach((key, value) -> {System.out.println(key+" - "+ value);});
        System.out.println(output);

        String srt = "Akhilesh Kumar sharma";
        String srt1 = String.valueOf(srt.chars().filter(ch -> ch != ' '));
        System.out.println(srt1.toLowerCase(Locale.ROOT));


        Map<String,Long> count = Arrays.stream(srt.split("")).map(String :: toLowerCase).
                collect(Collectors.groupingBy(s->s, LinkedHashMap :: new , Collectors.counting()));
        count.forEach((key, value) -> {System.out.println(key+ " - "+value);});
        System.out.println(count);
    }
}
