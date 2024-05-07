package Loops;

import java.util.ArrayList;

public class TryAndError {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            arrayList.add(i);
        }
    }
}
