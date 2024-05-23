package Collections;

import java.util.Map;

public class TreeMap {

    public static void main(String[] args) {

        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>(Map.of(0, "A", 1, "B", 2, "C"));

        treeMap.put(4, "E");
        treeMap.put(5,"F");
        treeMap.put(6,"G");

        System.out.println(treeMap);
    }
}
