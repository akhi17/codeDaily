package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,2,6,8,13,20,34);
        int sum = 0;
        for (int no : integers){
            sum = sum+no;
        }
        System.out.println(sum);

        int sum1 =  integers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        int sum2 = integers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        Optional<Integer> reduceWithReference = integers.stream().reduce(Integer::sum);
        System.out.println(reduceWithReference.get());

    }
}
