public class Main {
    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        int temp = 0;

        temp = b;

        b = a;

        a = temp;

        System.out.println("Value after swapping for a is " +a);
        System.out.println("Value after Swapping for b is " +b);
    }
}