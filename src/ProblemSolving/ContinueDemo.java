package ProblemSolving;

public class ContinueDemo {

    public static void main(String[] args) {
        for (int i = 0 ; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}

//Time Complexity O(1)

//Space Complexity O(1)


