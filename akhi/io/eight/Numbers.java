package akhi.io.eight;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();

        random.ints(1,100).limit(20).sorted().distinct().forEach(System.out::println);
    }
}
