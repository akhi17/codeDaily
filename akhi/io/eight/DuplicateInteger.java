package akhi.io.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInteger {
    //finding distinct element list
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(11,12,12,11,13,15,14,14,15,45,42,46,32,54,45);
        List<Integer> listWithoutDuplicates = myList.stream().distinct().collect(Collectors.toList());
        System.out.println("listWithoutDuplicates: "+listWithoutDuplicates);

        //only finding duplicate elements
        System.out.println("duplicate elements in the list");
        Set<Integer> set = new HashSet();
       // myList.stream().filter(n -> set.add(n)).forEach(System.out::println);
        List<Integer> onlyDuplicates = myList.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
        System.out.println(onlyDuplicates);
//        List<Integer> listWithoutDuplicate = myList.stream().filter(n -> set.add(n)).collect(Collectors.toList());
//        System.out.println(listWithoutDuplicate);
    }
}
