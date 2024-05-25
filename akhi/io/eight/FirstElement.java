package akhi.io.eight;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    //find the first element of the list

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //find the first element of the list

      //  myList.stream().findFirst().ifPresent(System.out::println);

        //find the total number of elements present in the list
        //System.out.println(myList.stream().count());

        //find the maximum value element present
        System.out.println(myList.stream().max(Integer::compare).get());
    }

}
