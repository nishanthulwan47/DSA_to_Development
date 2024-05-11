package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class CountDisntictElements {

    public static void main(String[] args) {

        int arr[] = new int[] { 6,7,8,9,9,6,8,6};

        System.out.println(countDistinct(arr, arr.length));

        //count should return



    }

    public static int countDistinct(int arr[], int n) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {

            hashSet.add(arr[i]);

        }
        return hashSet.size();
    }

    //Time Complexity for hashSet takes O(n)
    //Space Complexity takes O(n)
}
