package ProblemSolving;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        System.out.println(string);

        int a = sc.nextInt();

        System.out.println(a);

        byte b = sc.nextByte();

        System.out.println(b);

        float f = sc.nextFloat();

        System.out.println(f);
    }
}
