import java.util.Scanner;

public class SumofNaturalNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = n * (n+1) / 2;

        System.out.println(sum);
    }
}
