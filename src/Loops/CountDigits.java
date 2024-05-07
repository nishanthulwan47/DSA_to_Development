package Loops;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;

        while (n > 0) {
            n = n / 10;
            count = count + 1;
        }
        System.out.println(count);
    }
}

//Algorithm to Count the number of Digits of a number
//(1) Dive the number by 10 and keep counting the remainder
// Initialize the count variable to 0 and keep incrementing count variable to + 1 each time you divide it

