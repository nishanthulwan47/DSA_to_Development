import java.util.Scanner;

public class ArithemeticProgression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(nthTerm(2, 1, 5));

    }

    public static int nthTerm(int a, int d, int n) {
        int ans = a + (n-1) * d;

        return ans;
    }
}
