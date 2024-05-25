package akhi.io.misc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurance {

    /*Input:List<String> names =
            Arrays.asList("Jon", "Ajeet", "Steve",
                    "Ajeet", "Jon", "Ajeet");
    Output :{Steve=1, Jon=2, Ajeet=3}*/

    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("Jon", "Ajeet", "Steve",
                        "Ajeet", "Jon", "Ajeet");
        Map<String, Long> frqMap = names.stream().
                collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

        for (Map.Entry<String, Long> entry : frqMap.entrySet()){
            System.out.println(entry.getKey() + "= "+entry.getValue());
        }
    }
}
