package Arrays;

public class Basics1 {

    public static void main(String[] args) {

        //Declaration of 2D dimensional Arrays

        int arr [][] = {{1,2,4,
            5,6,7}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
