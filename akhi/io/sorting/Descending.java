package akhi.io.sorting;

import java.util.Arrays;
import java.util.Collections;

public class Descending {
    public static void main(String[] args) {
        Integer [] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("descending order :"+Arrays.toString(arr));

        String [] arr1 = {"Akhi","zkhi", "Bkhi", "jhki", "skhi"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));;

    }
}
