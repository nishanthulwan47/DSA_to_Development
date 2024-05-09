package LeetcodeTop150Questions;

import java.util.Arrays;

public class twoSumBinarySearch {

    static boolean binarySearch(int A[], int low, int high, int SearchKey) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if search Key is present in mid

            if (A[mid] == SearchKey) {
                return true;
            }
            if (A[mid] < SearchKey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    static boolean checkTwoSum(int A[], int arr_size, int sum) {
        int left;

        int right;

        Arrays.sort(A);

        // Traversing all the elements in an array and search for the Search Key

        for (int i = 0; i < arr_size; i++) {
            int searchKey = sum - A[i];

            if (binarySearch(A, i+1, arr_size-1, searchKey) == true) {
                return true;
            }
        }
        return false;

    }

    //Time Complexity : O(NLogN)
    // Space Complexity: O(1)

    public static void main(String[] args) {

            int A[] = {1, 4, 45, 6, 10, -8};
            int n = 14;
            int arr_size = A.length;

            if (checkTwoSum(A, arr_size, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

    }
}
