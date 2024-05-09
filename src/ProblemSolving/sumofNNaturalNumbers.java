package ProblemSolving;

public class sumofNNaturalNumbers {


    static int findSum(int n) {

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        System.out.println(findSum(5));
    }

    //Time Complexity is O(1)

    // Space Complexity is O(1)

}
