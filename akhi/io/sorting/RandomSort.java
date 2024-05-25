package akhi.io.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Integer[] arr = {10, 310, 1900, 31, 41, 72, 140, 102};
       //Random no sort
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + i;
            Arrays.sort(array);
            //    System.out.println(Arrays.toString(array));
        }
        //generic sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //reverse sort
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
