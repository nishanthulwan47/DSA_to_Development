package ProblemSolving;

public class GeometricProgression {

    public static void main(String[] args) {

        //Starting number

        int a = 2;

        // Common ratio

        int r = 3;

        //Nth term to be find

        int N = 5;

        System.out.print("The " + N + "th term of G.P" + " Series is " + Nth_Of_GP(a, r, N));



    }

    public static int Nth_Of_GP(int a, int r, int N) {

        return (a * (int)(Math.pow(r, N-1)));

    }
}