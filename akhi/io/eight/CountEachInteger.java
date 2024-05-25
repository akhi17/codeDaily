package akhi.io.eight;

import java.util.Scanner;

public class CountEachInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number, count, digit, temp;
        System.out.println("Enter any number");
        number = sc.nextInt();
     //   System.out.println("Digit\tFrequency");
        for (int i = 0; i <=9 ; i++) {
            count = 0;
            temp=number;
            while (temp>0){
                digit = temp%10;
                if (digit==i){
                    count++;
                }
                temp=temp/10;
            }
            if (count>0){
                System.out.println(i+"\t"+count);
            }
        }
    }
}
