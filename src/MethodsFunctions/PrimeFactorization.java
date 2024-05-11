package MethodsFunctions;

import java.util.Scanner;

public class PrimeFactorization {


    public static void main (String[] args) {

        //Can you write a Program to check Prime factorization of a given number


    }

    public boolean isPRime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void primeFactorization(int n ) {
        for (int i = 2; i < n; i++) {
            if (isPRime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i);
                    x = x * i;
                }

            }

        }
    }
}
