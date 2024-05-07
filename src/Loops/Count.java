package Loops;

public class Count {

    public static void main(String[] args) {

        long n = 345678987;
        System.out.println("Number of Digits: " +countDigit(n));

    }

    static int countDigit(long n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
