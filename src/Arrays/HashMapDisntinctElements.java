package Arrays;

import java.util.HashMap;
import java.util.Map;

public class HashMapDisntinctElements {

    public static void main(String[] args) {

        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map.size());
    }


}
