public class FormatInJava  {

    public static void main(String[] args) {

        int x = 100;

        System.out.printf("Printing Simple Integer: x = %d\n", x);

        System.out.printf("Formatted with Precision: PI = %.2f\n", Math.PI);

        float n = 5.2f;

        System.out.printf("Formatted to Specific width: n = %.4f\n", n);

        n = 2324435.3f;

        System.out.printf(
                "Formatted to right margin: n = %20.4f\n", n);
    }

}
