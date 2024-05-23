package Arrays;

import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Nishant", 2);
        map.put("Santa Clause Barbara", 3);

        int nishant = map.get("Nishant");

        System.out.println("Nishant is " +nishant);

        map.put("Monkey", 2);

        // Check if a key Exists

        if (map.containsKey("Monkey")) {
            System.out.println("We Found a freaking Monkey Y'all");
        }

        map.remove("Apple");

        for (String names: map.keySet()) {
            int names1 = map.get(names);
            System.out.println("Quantity of " + names + ": " + names1);
        }
    }
}
