package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(20);

        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(50,60,70,80,90));

        arrayList.add(10);
        arrayList.add(0, 5);
        arrayList.addAll(1, arrayList1);

        System.out.println(arrayList.contains(0));
        System.out.println(arrayList.indexOf(4));

//        System.out.println(arrayList);
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        arrayList.forEach((x) -> {
            System.out.println(x);
        });

    }
}
