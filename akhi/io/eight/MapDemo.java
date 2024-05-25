package akhi.io.eight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> demo = new HashMap<>();
        demo.put(1,"akhi");
        demo.put(2,"annu");
        demo.put(3,"jain");
        demo.put(4,"mist");
        demo.put(5,"ben");

        System.out.println(demo);
        System.out.println(demo.entrySet());
        demo.entrySet().forEach(System.out::println);
        demo.entrySet().iterator().forEachRemaining(E -> System.out.println(E));

    }
}
