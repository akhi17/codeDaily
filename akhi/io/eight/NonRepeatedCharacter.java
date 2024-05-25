package akhi.io.eight;

import java.util.stream.Collectors;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Akhilesh is coding in java for a long time";
        //  "Cactus".chars().forEach(c -> System.out.println((char)c));

        // "Akhilesh".chars().mapToObj(c -> Character.valueOf((char) c)).findFirst().ifPresent(System.out::println);
     "changajbadgywbajcbajcuadgjacjahjshfusajsahhsajdhajdhahdajdhjdhajhahahdajhajdhajhajdhajhajdh".chars().mapToObj(c -> Character.valueOf((char) c)).collect(Collectors.toSet()).forEach(s -> System.out.println(s));
      //  "stress".chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.toSet()).forEach(s -> System.out.println(s));
    }
}
