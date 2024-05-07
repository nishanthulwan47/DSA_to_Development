package Loops;

public class Factorial {

    public static void main(String[] args) {

        int num = 5;

        System.out.println("The factorial of number 5 is : " +factorial(5));

    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
