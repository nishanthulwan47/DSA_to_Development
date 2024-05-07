package Loops;

import java.util.Scanner;

public class LCMOfTwoNumbers {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the first number: ");

       int num1 = sc.nextInt();

       System.out.print("Enter the second number");

       int num2 = sc.nextInt();

       int lcm = Math.max(num1 , num2);

       for (int i = lcm; i <= num1 * num2; i += lcm) {
           if (i % num1 == 0 && i % num2 == 0) {
               lcm = i;
               break;
           }
       }
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
       sc.close();

    }
}
