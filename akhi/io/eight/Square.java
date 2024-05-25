package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Square {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,2,6,8,13,20,34);
        OptionalDouble intStream = integers.stream().mapToInt(n -> n * n).filter(n -> n > 10000).average();
        if (intStream.isPresent()){
            System.out.println("average is :"+ intStream.getAsDouble());
        }else{
            System.out.println("no qualifying elements");
        }
    }
}
