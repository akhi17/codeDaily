package akhi.io.misc;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "hello akhilesh welcome akhilesh";
        String[] split = str.split(" ");

        HashMap<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if(myMap.containsKey(split[i])){
                int count = myMap.get(split[i]);
                myMap.put(split[i], count +1);
            } else{
               myMap.put(split[i], 1);
            }
        }
        System.out.println(myMap);
    }
}
