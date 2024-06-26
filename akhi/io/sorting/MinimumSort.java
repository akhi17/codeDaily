package akhi.io.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSort {
    public static void main(String[] args) throws Exception {
        int[] a = {101, 758, 315, 730, 472, 619, 460, 479};
        int n = a.length;
        // Output will be 5
        System.out.println(new MinimumSort().minSwaps(a, n));
    }

    public int minSwaps(int[] arr, int N) {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
        Arrays.sort(temp);
        for (int i = 0; i < N; i++) {

            // This is checking whether the current element is at the right place or not

            if (arr[i] != temp[i]) {
                ans++;

                // Swap the current element with the right index so that arr[0] to arr[i] is sorted
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}

