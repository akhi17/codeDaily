package akhi.io.eight;

import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int firstArray[] = {1, 2, 2, 1};
        int secondArray[] = {2, 2};

        Arrays.stream(firstArray).filter(x -> Arrays.stream(secondArray).
                anyMatch(y -> y == x)).distinct().forEach(System.out::println);
    }
}
