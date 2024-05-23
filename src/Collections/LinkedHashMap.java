package Collections;

public class LinkedHashMap {

    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>(5, .75f, true);



        linkedHashMap.put(2, "A");
        linkedHashMap.put(3, "B");
        linkedHashMap.put(4,"C");
        linkedHashMap.put(5,"D");

        System.out.println(linkedHashMap);

        linkedHashMap.get(2);

        System.out.println(linkedHashMap.get(3));

        linkedHashMap.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
