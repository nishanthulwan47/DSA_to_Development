package Arrays;

import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print(findAverage(a));


    }

    public static double findAverage(int [] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return (double) sum / a.length;
    }
}
