package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 34, 33, 51, 57};

        //Iterate
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 5, 3, 35, 3, 43, 443, 5, 35, 35, 5, 3, 53, 53, 5, 35);
        // myList.forEach(System.out::println);


        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            // System.out.println(listIterator.next());
        }
            int evenSum = IntStream.of(arr).filter(n -> n % 2 == 0).sum();
             System.out.println("sum of all even no:" + evenSum);

            int oddSum = IntStream.of(arr).filter(n -> n % 2 == 1).sum();
             System.out.println("sum of all even no:" + oddSum);

            //use of range
            int oddSum1 = IntStream.range(1, 100).filter(n -> n % 2 == 1).sum();
             System.out.println("sum of odd number" + oddSum1);


            // use of skip
            //In this stream, we're picking up the even numbers of the stream but we skip the first two
            //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 == 0).skip(2).forEach(i -> System.out.print(i + " "));
            //use of limit
            //we're truncating an infinite stream of numbers into a stream with only ten even numbers.
            Stream.iterate(0, i -> i + 1).filter(i -> i % 2 == 0).limit(10).forEach(System.out::println);

    }
}
