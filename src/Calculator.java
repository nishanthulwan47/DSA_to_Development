import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        //Creating a Basic Calculator in Java using nested if/else Statements
        //Algorithm
        //1. Take two numbers and the operator as inputs from the user using the Scanner Class
        //2. Use nested if/esle Statements to write the logic for the operations
        //3. Initialize a new integer which will store the answer initially as 0
        // Print the answer

        Scanner scanner = new Scanner(System.in);

        //Taking input from the user using the Scanner class
        System.out.print("Enter the first and second number - ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Selecting the operands for the calculations
        System.out.print("Choose and Enter the type of operation you want to perform (+, -, *, /, %) -");
        char op = scanner.next().charAt(0);
        solve(a, b, op);

    }
        public static int solve(int a, int b, char op) {
            int ans = 0;
            //addition
            if (op == '+') {
                ans = a + b;
            } else if (op == '-') {
                ans = a - b;
            } else if (op == '*') {
                ans = a * b;
            } else if (op == '/') {
                ans  = a / b;
            } else if (op == '%') {
                ans = a % b;
            }
            // Printing the final result.
            System.out.println("Your answer is - " + ans);
            return ans;
        }




}
