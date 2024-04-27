import java.util.Scanner;

public class IfElseNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(n * (n+1) / 2);
        }


    }
}
