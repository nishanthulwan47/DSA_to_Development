package Arrays;

public class CountDisntictUsingNaiveApproach {

    static int countDistinct(int a[], int n) {

        int count = 1;

        for (int i = 1; i < n ; i++) {
               boolean isDistinct = true;

             for (int j = 0; j < i; j++) {
                 if (a[i] == a[j]) {
                     isDistinct = false;
                     break;
                 }
             }

             if (isDistinct) {
                 count++;
             }


        }
        return count;


    }

    public static void main(String[] args) {

        int a[] = {20,10,10,20,30,30,50,50,70};

        int n = a.length;

        System.out.println(countDistinct(a, n));
    }
}
