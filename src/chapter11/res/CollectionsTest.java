package chapter11.res;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list = " + list);
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println("list = " + list);
        Collections.rotate(list, 2);
        System.out.println("list = " + list);
        Collections.swap(list, 0, 1);
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("list = " + list);

        int idx = Collections.binarySearch(list, 3);
        System.out.println("idx = " + idx);

        Comparable max = Collections.max(list);
        System.out.println("max = " + max);
        Comparable min = Collections.min(list);
        System.out.println("min = " + min);

        Collections.fill(list, 9);
        System.out.println("list = " + list);

        List<Integer> integers = Collections.nCopies(list.size(), 2);
        System.out.println("integers = " + integers);

        List list1 = new ArrayList(10);
        Collections.fill(list1, 3);
        System.out.println("list1 = " + list1);

    }
}
