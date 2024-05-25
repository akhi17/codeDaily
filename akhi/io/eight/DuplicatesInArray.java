package akhi.io.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArray {
    public static void main(String[] args) {

        Integer []array = {1, 2, 3, 6, 3, 6, 1};
        List<Integer> list = Arrays.asList(array);

        Set items = new HashSet<>();
        Set<Integer> duplicates = list.stream().filter(o -> !items.add(o)).collect(Collectors.toSet());
        System.out.println(duplicates);

    }
}
