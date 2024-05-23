package Collections;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>(Map.of(0, "A", 1, "B", 2, "C", 3, "D"));

        hashMap.put(4, "E");
        hashMap.put(5, "F");



        System.out.println(hashMap);
    }
}
