package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegers {
    //find out all the even numbers exist in the list
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,87,65,43,22,45,67,87,43,34,23);
        //System.out.println(list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList()));
        list.stream().filter(n -> n % 2 == 0).forEach(System.out ::println);
    }
}
