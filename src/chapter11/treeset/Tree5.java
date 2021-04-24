package chapter11.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Tree5 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        for(int i = 0; set.size()<6; i++){
            set.add((int)(Math.random() * 45) + 1);
        }
        System.out.println("set = " + set);//TreeSet은 BST로되어있음 무조건 정렬됨
        //정렬, 범위검색에 유리//
        // 그러나 추가 삭제엔불리.

        System.out.println("set.subSet(1, 4) = " + set.subSet(1, 4));
        System.out.println("set.tailSet(10) = " + set.tailSet(10));
        System.out.println("set.headSet(10); = " + set.headSet(10));
        System.out.println("set.ceiling(10) = " + set.ceiling(10));
        System.out.println("set.floor(10) = " + set.floor(10));
        System.out.println("set.higher(10) = " + set.higher(10));
        System.out.println("set.lov = " + set.lower(10));
        // TreeSet 컬렉션 클래스는 정렬, 범위 검색에 유리함. 왠면 BST로되어있으닌까
        // 요소 추가삭제는 불리함.

    }
}
