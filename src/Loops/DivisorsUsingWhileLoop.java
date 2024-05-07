package Loops;

import java.util.Scanner;

public class DivisorsUsingWhileLoop {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number");

    int num = sc.nextInt();

    int i = 1;

    System.out.print("The divisors of " + num + " are: ");
    while (i <= num) {
        if (num % i == 0) {
            System.out.print(i + " ");
        }
        i++;
    }
    sc.close();
}
}
