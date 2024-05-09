package MethodsFunctions;

import java.util.Scanner;

public class methods {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();*/
        System.out.print(printFirst(23456789));

    }

    public static long printFirst(long n) {
        while (n > 10) {
            n = n / 10;
        }
        return n;
    }
}
