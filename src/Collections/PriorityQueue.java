package Collections;

import java.util.Comparator;

public class PriorityQueue implements Comparator<Integer> {

    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>(new java.util.PriorityQueue<>());

        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(3);

        System.out.println(priorityQueue.peek());

        priorityQueue.forEach((x)-> System.out.println(x));

        priorityQueue.poll();

        System.out.println("After Deletion");

        priorityQueue.forEach((x)-> System.out.println(x));

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1<o2) return 1;
        if (o1>o2) return -1;
        return 0;
    }
}
