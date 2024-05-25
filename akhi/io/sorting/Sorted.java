package akhi.io.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        Integer arr[] = {1,2,4,25,3,34,2,4,35,35,35,45,32,25,46,23};
        List<Integer> myList = Arrays.asList(arr);
        System.out.println("unsorted : "+myList);
        System.out.println("now printing sorted list");
        myList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
