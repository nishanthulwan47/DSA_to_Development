package ProblemSolving;

import java.util.Scanner;

public class TotalNoOfDaysInaMonth {

    public static void main (String[] args) {



        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();


        switch (month) {
            case 1:
                System.out.println("31 days");
            break;
            case 2:
                System.out.println("29 days");
            case 3:
                System.out.println("31 days");
            case 4:
                System.out.println("31 days");
            case 5:
                System.out.println("31 days");
            case 6:
                System.out.println("31 days");
            case 7:
                System.out.println("31 days");
            case 8:
                System.out.println("31 days");
            default:
                System.out.println("Invalid Input");
        }
    }
}
