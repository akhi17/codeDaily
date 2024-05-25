package akhi.io.misc;

public class Armstrong {
    public static void main(String[] args) {
         int input = 5;
        System.out.println("digits present in the number: "+countNumberOfDigits(input));
     if(checkArmstrongNumber(input)){
         System.out.println("given number is armstrong number");
     }else {
         System.out.println("given number is not an armstrong number");
     }
    }

    private static boolean checkArmstrongNumber(int input) {
        int i = input;
        int sum = 0;
        int digit = 0;
      //  countNumberOfDigits(input);
        while (i>0){
            digit = i % 10;
            i = i/10;
            sum = (int) (sum + Math.pow(digit,countNumberOfDigits(input)));
        }
        return input == sum;
    }

    private static int countNumberOfDigits(int input) {
        int count = 0;
        while (input > 0){
            input = input /10;
            count++;
        }
        return count;
    }
}
