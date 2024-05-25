package akhi.io.eight;

import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
       long a[] = {1234567890127890L,9,5,67,34};
        System.out.println("SecondLargest :"+ getSecondLargest(a,5));
    }
    public static long getSecondLargest(long[]a,int total){
        Arrays.sort(a);
        return a[total -2];
    }
}
