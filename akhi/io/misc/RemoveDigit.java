package akhi.io.misc;

public class RemoveDigit {
    static String removeDigit(String str){
        return str.replaceAll("\\d","");
    }

    static String removeAlphabet(String str){
        return str.replaceAll("[a-zA-Z]","");
    }

    static  String removeSpace(String str){
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "ak9h8ile7sh6Sh5a4r3ma";
        System.out.println(removeDigit(str));
        System.out.println(removeAlphabet(str));

        String rty = "akhilesh kumar      sharma";
        System.out.println(removeSpace(rty));
    }
}
