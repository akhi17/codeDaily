package akhi.io.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        // 1,3,10,11,9,1,0,4
        List<String> list = Arrays.asList("CANE","DANE","AKHI","BALA");
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList()));

        //[0, 1, 1] [3, 4] [9, 10, 11]
        int counter = 1;
        //
    }

}
