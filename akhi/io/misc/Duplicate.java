package akhi.io.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4,4,5,6,7,1,2);
        Set<Integer> result = findDuplicateBySetAdd(list);
        result.forEach(System.out::println);
    }

    private static Set<Integer> findDuplicateBySetAdd(List<Integer> list) {
        Set items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());
    }
}
