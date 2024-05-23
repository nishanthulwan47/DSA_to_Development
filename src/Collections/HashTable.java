package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(3, "Nishant");
        hashtable.put(4, "Jon");
        hashtable.put(5, "Terry");
        hashtable.put(6, "Yeaah");
        hashtable.put(7, "Kelly");

        System.out.println(hashtable);

        System.out.println(hashtable.clone());

        Enumeration enumeration = hashtable.elements();

        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println(hashtable.containsKey(7));
    }
}
