package LeetcodeTop150Questions;

import java.util.HashMap;
import java.util.Map;

public class twoSum {


    public static void main (String[] args) {

        int A[] = {0, -1, 2, -3, 1};

        int x = -2;

        int size = A.length;

        if (checkPair(A, size, x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }





    }

    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }

        }
        return null;
    }

    static boolean checkPair(int A[], int size, int x) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }


    // HashMap Problem

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // Current + x = target
            // x = target - Current
            int x = target - current;

            if (map.containsKey(x)) {
                return new int[] {map.get(x), i };
            }
            map.put(current, i);
        }
        return null;
    }

    //Time : O(n)
    // Space: O(n)
}
