package akhi.io.misc;

public class MultipleCatch {
    public static void main(String args[]) {
        try {
            int n = 10, x = 0;
            int arr[] = new int[n];
            for (int i = 0; i <= n; i++) {
                arr[i] = i / x;
            }
        }

        catch (ArithmeticException exception) {
            System.out.println("AE block = ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("AIOB block = ArrayIndexOutOfBoundsException");
        }
        catch (Exception exception) {
            System.out.println("Exception block = Exception");
        }
    }
}
