package akhi.io.misc;

public class OverRiding {
    public static int add(int a, int b){
        return a+b;
    }
    public static String add(String a, String b){
        return a.concat(", ").concat(b);
    }

    public static String add(double a, String b){
        int a1 = (int)(a);
        return a1+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,5));
        System.out.println(add("Akhilesh","Kumar"));
        System.out.println(add(1,"hello"));
    }
}
