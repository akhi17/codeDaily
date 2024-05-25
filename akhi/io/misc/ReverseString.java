package akhi.io.misc;

public class ReverseString {
    public static void main(String[] args) {
        String s[] = "akhilesh kumar".split(" ");

        String result = " ";
        for (int i = s.length -1; i >= 0 ; i--) {
            result += s[i]+ " ";
        }
        System.out.println("reversed string : "+ result);

        String s1[] = "AKHILESH KUMAR SHARMA".split(" ");
        String result1 = " ";
        for (int i = s1.length-1; i >=0 ; i--) {
            result1 += s1[i]+" ";
        }
        System.out.println("reversed String : "+ result1);
    }
}
