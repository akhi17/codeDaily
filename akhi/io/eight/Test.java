package akhi.io.eight;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
               // result = result + words[i];
                result += words[i];
            } else {
               // result = result + words[i] + " ";
                result +=  words[i] + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "akhilesh welcome to jamshedpur";
        System.out.println(reverseWords(str));

        String revString = Arrays.stream(str.split(" ")).
                map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(revString);
    }
}
