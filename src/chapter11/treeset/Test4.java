package chapter11.treeset;

import java.util.HashSet;
import java.util.TreeSet;

//headSet, tailSEt 메서드
public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 100, 50, 40, 20, 15};
        TreeSet set = new TreeSet();

        for (int i : arr) {
            set.add(i); // autoBoxing
            // 정렬이되서나옴
        }
        System.out.println("set = " + set);

        System.out.println("set.headSet(50) = " + set.headSet(50));
        System.out.println("set.tailSet(50) = " + set.tailSet(50));
    }
}
