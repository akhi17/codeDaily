package akhi.io.misc;

public class Test {
    Test(int a, int b)
    {
        System.out.println("akhil a = "+a+" b = "+b);
    }
    Test(int a, float b)
    {
        System.out.println("aman a = "+a+" b = "+b);
    }
    public static void main (String args[])
    {
        byte a = 10;
        byte b = 15;
        Test test = new Test(a,b);
    }
}
