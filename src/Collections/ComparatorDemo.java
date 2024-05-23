package Collections;
import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {

        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};

        System.out.println(Arrays.compare(a, b));

        int c[] = Arrays.copyOf(a, 4);

        for (int x: c) {
            System.out.println(x);
        }
    }
}
