package Collections;

import java.util.Iterator;

public class LinkedHashSet {

    public static void main(String[] args) {

        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>(10);

        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        System.out.println(linkedHashSet);
    }
}
