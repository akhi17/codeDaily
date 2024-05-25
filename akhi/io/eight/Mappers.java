package akhi.io.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mappers {
    public static void main(String[] args) {
        List<Integer> numberes = Arrays.asList(2,3,4,7,8,6,5,4,5,6,3);
        List<Integer> sqaures = numberes.stream().map(x -> x*x).collect(Collectors.toList());
        Set<Integer> sqauresSet = numberes.stream().map(x -> x*x).collect(Collectors.toSet());

        System.out.println("sqaures : "+sqaures);
        System.out.println("sqauresSet : "+sqauresSet);

        int even = numberes.stream().filter(x->x%2==0).reduce(9,(ans,i)->ans +i);
        System.out.println("even : "+even);

        List<String> names = Arrays.asList("akhi","bist","anup","cart","annie");
        List<String> namesStartingWithA = names.stream().filter(s-> s.startsWith("a")).collect(Collectors.toList());
        System.out.println("namesStartingWithA : "+namesStartingWithA);

        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedNames : "+ sortedNames);
    }
}
