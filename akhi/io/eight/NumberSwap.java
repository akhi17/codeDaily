package akhi.io.eight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
    String string = "akhilesh";
    char java8result = findFist(string);
        System.out.println("java8result: "+java8result);
    char character = fistNonRepeatingChar(string);
        System.out.println("resrultFrom HashMap : "+ character);
    }
    public static char fistNonRepeatingChar(String s){
        HashMap<Character, Integer> sc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(sc.containsKey(c)){
                sc.put(c, sc.get(c)+1);
            }else {
                sc.put(c,1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sc.get(c)==1){
                return c;
            }
        }
        throw new RuntimeException();
    }
    public static Character findFist(String string){
        Map<Character,Integer> map = new LinkedHashMap();
        for (Character ch : string.toCharArray()){
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 :1);
        }

        return (map.entrySet().stream().filter(x -> x.getValue() == 1).findAny().get().getKey());
    }
}
