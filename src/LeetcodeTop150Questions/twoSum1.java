package LeetcodeTop150Questions;

import java.util.Arrays;

public class twoSum1 {

    static boolean hasCandidates(int A[], int arr_size, int sum) {
        int left = 0;

        int right = arr_size-1;

        Arrays.sort(A);

        while (left < right) {
            if (A[left] + A[right] == sum) {
                return true;
            } else if (A[left] + A[right] < sum) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int A[] = {1, 4, 45, 6, 10, -8};
        int n = 16;
        int arr_size = A.length;

        if (hasCandidates(A, arr_size, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
