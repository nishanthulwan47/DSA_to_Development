package Arrays;

public class MaximumOfArray {

    static int arr[] = {23,45,67,89,90,100};
    public static void main(String[] args) {

        System.out.println(maximumOfArray(arr));

    }

     static int maximumOfArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
}
