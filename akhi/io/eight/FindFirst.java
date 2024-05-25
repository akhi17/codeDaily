package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> firstNumber =  numbers.stream().findFirst();
        if(firstNumber.isPresent()) {
            Integer firstNum = firstNumber.get();
            System.out.println("Sequential findFirst() result is = " + firstNum);
        }
        else {
            System.out.println("No value is pressnt");
        }

        List<String> names = Arrays.asList("Putin", "Biden", "Manmohan", "Modi", "Jack");
        Optional<String> firstName = names.stream().filter(str -> str.startsWith("M")).findFirst();
        System.out.println(firstName);
    }
}
