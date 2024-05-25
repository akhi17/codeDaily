package akhi.io.EqualHashcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        Karmchari e1 = new Karmchari("akhi","jsr");
        Karmchari e2 = new Karmchari("ram","jsr");
        Karmchari e3 = new Karmchari("Nand","pune");
        Karmchari e4 = new Karmchari("manish","pune");
        Karmchari e5 = new Karmchari("ashish","pune");
        Karmchari e6 = new Karmchari("sam","delhi");

        List<Karmchari> employees = Arrays.asList(e1,e2,e3,e4,e5,e6);

        Map<String, List<Karmchari>> groupedbyCity = employees.stream().
                collect(Collectors.groupingBy(Karmchari::getCity));
        System.out.println(groupedbyCity.entrySet());
    }
}
