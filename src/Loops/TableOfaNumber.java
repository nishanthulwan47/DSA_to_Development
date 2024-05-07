package Loops;

import java.util.Scanner;

public class TableOfaNumber {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        for (int i = 1; i <= 11; i++) {

            System.out.print(i * n);
        }




    }
}
