package Loops;

public class isPrime {

    public static void main(String[] args) {
        if (isPrime(11))
            System.out.println("true");
        else
            System.out.println("False");
        if (isPrime(1031))
            System.out.println("true");
        else
            System.out.println("False");

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
