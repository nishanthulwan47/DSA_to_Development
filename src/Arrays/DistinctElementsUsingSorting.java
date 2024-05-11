package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DistinctElementsUsingSorting {

    static int countDistinct(int arr[], int n) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < n; i++) {

            while (i < n - 1 && arr[i] == arr[i+1]) {
                i++;
            }
            count++;
        }
        return count;

    }

    public static void main(String[] args) {

        int arr[] = {10,10,20,20,30,30,40};

        int n = arr.length;

        System.out.println(countDistinct(arr, n));
    }

    // Sorting always takes O(nlogn) Time Complexity
    //Space Complexity is O(1)
}
