package Collections;
import java.util.*;

public class ArrayDeque {

    public static void main(String[] args) {

        java.util.ArrayDeque<Integer> deque = new java.util.ArrayDeque<>();

        deque.offerLast(10);
        deque.offerLast(20);
        deque.offerLast(30);
        deque.offerLast(40);

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        deque.offerFirst(4);

        deque.forEach((x)->System.out.println(x));

    }
}
