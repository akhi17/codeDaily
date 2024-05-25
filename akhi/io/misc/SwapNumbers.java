package akhi.io.misc;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("swapped numbers : a: "+ a +" &  b: "+ b);
    }
}
